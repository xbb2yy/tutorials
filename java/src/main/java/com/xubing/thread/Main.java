package com.xubing.thread;

public class Main {

    private static volatile int a = 0;

    public static void main(String[] args) {
        print();
    }

    /**
     * 两个线程交替打印0-100
     */
    public static void print() {
        new Thread(() -> {
            while (a <= 100) {
                synchronized (Main.class) {
                    if (a % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + a++);
                        Main.class.notify();
                    } else {
                        try {
                            Main.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (a <= 100) {

                synchronized (Main.class) {
                    if (a % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + a++);

                        Main.class.notify();
                    } else {
                        try {
                            Main.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }

    static class Counter {
        private static int i;

        public static int incrementAndGet() {
            return ++i;
        }
    }
}