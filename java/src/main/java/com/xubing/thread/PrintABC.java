package com.xubing.thread;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/28 17:58
 */
public class PrintABC {

    private static volatile int flag = 1;
    private static volatile int count = 0;

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        new Thread(() -> {
            for (; count < 10;) {
                synchronized (PrintABC.class) {

                    if (flag == 1) {
                        System.out.println(Thread.currentThread().getName());
                        flag = 2;
                        PrintABC.class.notifyAll();
                    } else {
                        try {
                            PrintABC.class.wait();
                        } catch (Exception e) {

                        }
                    }
                }
            }

        }, "A").start();

        new Thread(() -> {
            for (; count < 10;) {
                synchronized (PrintABC.class) {
                    if (flag == 2) {
                        System.out.println(Thread.currentThread().getName());
                        flag = 3;
                        PrintABC.class.notifyAll();
                    } else {
                        try {
                            PrintABC.class.wait();
                        } catch (Exception e) {

                        }
                    }
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (; count < 10;) {
                synchronized (PrintABC.class) {
                    if (flag == 3) {
                        count++;
                        System.out.println(Thread.currentThread().getName());
                        System.out.println(count);
                        flag = 1;
                        PrintABC.class.notifyAll();
                    } else {
                        try {
                            PrintABC.class.wait();
                        } catch (Exception e) {

                        }
                    }
                }
            }
        }, "C").start();
    }
}
