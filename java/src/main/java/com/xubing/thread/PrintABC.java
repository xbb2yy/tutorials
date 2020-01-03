package com.xubing.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/28 17:58
 */
public class PrintABC {
    private static int i = 1;
    private static int flag = 1;

    static class Print implements Runnable{
        @Override
        public void run() {
            for (; ;) {
                synchronized (PrintABC.class) {
                    if (flag == 1 && i <= 10) {
                        System.out.println(i);
                        System.out.println("A");
                        flag = 2;
                        i++;
                        PrintABC.class.notifyAll();
                    } else {
                        try {
                            PrintABC.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class PrintB implements Runnable{
        @Override
        public void run() {
            for (; ;) {
                synchronized (PrintABC.class) {
                    if (flag == 2 && i <= 11) {
                        System.out.println("B");
                        flag = 3;
                        PrintABC.class.notifyAll();
                    } else {
                        try {
                            PrintABC.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class PrintC implements Runnable{
        @Override
        public void run() {
            for (; ;) {
                synchronized (PrintABC.class) {
                    if (flag == 3 && i <= 11) {
                        System.out.println("C");
                        flag = 1;
                        PrintABC.class.notifyAll();
                    } else {
                        try {
                            PrintABC.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 3, 0, TimeUnit.DAYS, new ArrayBlockingQueue(1));
        pool.execute(new Print());
        pool.execute(new PrintB());
        pool.execute(new PrintC());
    }
}

