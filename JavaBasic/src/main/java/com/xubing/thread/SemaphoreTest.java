package com.xubing.thread;

import java.util.concurrent.*;


/**
 * @author xubing xbbjava@163.com
 * @className SemaphoreTest
 * @description TODO
 * @date 2018/6/4 9:22
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        ExecutorService pool = new ThreadPoolExecutor(10, 10, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));

        for (int i = 0; i < 10; i++) {
            pool.submit(new Worker(i, semaphore));
        }

    }

    private static class Worker implements Runnable {

        private int num;
        private Semaphore semaphore;

        public Worker(int num, Semaphore semaphore) {
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire(2);
                System.out.println(this.num + ":run");
                Thread.sleep(10000);
                System.out.println(this.num + ":stop");
                System.out.println(11111);
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
