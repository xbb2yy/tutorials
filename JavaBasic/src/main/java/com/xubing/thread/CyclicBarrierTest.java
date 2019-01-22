package com.xubing.thread;

import java.util.concurrent.*;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/7/27 15:47
 */
public class CyclicBarrierTest {


    public static void main(String[] args) {
        int num = 10;
        CyclicBarrier barrier = new CyclicBarrier(12);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(15, 15, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));
        for (int i = 0; i < 13; i++) {
            pool.execute(new Task(barrier, i));
        }
    }


    private static class Task implements Runnable {

        private CyclicBarrier barrier;
        private Integer i;

        public Task(CyclicBarrier barrier, Integer i) {
            this.barrier = barrier;
            this.i = i;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
