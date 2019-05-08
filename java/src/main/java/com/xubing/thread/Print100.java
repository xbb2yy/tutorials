package com.xubing.thread;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/22 9:39
 */
public class Print100 {

    private static volatile int i = 0;


    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (Print100.class) {
                while (i <= 99) {
                    if (i % 2 == 0) {
                        try {
                            Print100.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i++;
                    Print100.class.notify();
                }
            }
        }, "t1").start();


        new Thread(() -> {
            synchronized (Print100.class) {
                while (i <= 99) {
                    if (i % 2 != 0) {
                        try {
                            Print100.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i++;
                    Print100.class.notify();
                }
            }
        }, "t2").start();
    }
}
