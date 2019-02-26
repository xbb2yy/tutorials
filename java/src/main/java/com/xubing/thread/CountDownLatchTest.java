package com.xubing.thread;

import sun.rmi.runtime.Log;

import java.util.concurrent.*;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/7/27 16:04
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(11);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        for (int i = 0; i < 15; i++) {
            Future<Integer> future = pool.submit(new Task(latch, i));

        }

        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            latch.await();
            System.out.println("大家都执行完了吗");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static class Task implements Callable<Integer> {
        private  CountDownLatch latch;
        private Integer i;
        public Task(CountDownLatch latch, Integer i) {
            this.latch = latch;
            this.i = i;
        }
        @Override
        public Integer call() throws Exception {
            latch.countDown();
            System.out.println(i);
            return 1;
        }
    }
}
