package com.xubing.thread;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author xubing xbbjava@163.com
 * @className ExecutorTest
 * @description TODO
 * @date 2018/6/7 9:37
 */
public class ExecutorTest {

    @Test
    public void test1() {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(10));
        pool.execute(() -> System.out.println(1));

    }

    @Test
    public void testExecutors() {

    }

    @Test
    public void test2() throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2));

        CountDownLatch latch = new CountDownLatch(2);
        pool.execute(() -> {
            try {
                System.out.println("running...........");
                Thread.sleep(10000);
                System.out.println("sleep completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                latch.countDown();
            }
        });

        pool.execute(() -> {
            try {
                System.out.println("running...........");
                Thread.sleep(1000);
                System.out.println("sleep completed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                latch.countDown();
            }
        });

        latch.await();

    }

    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 2, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));

        for (int i = 0; i < 4; i++) {
            pool.execute(() -> {
                try {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}
