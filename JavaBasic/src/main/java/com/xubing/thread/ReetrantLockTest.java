package com.xubing.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/7/30 18:47
 */
public class ReetrantLockTest {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));
        pool.execute(() -> {
            lock.lock();
            System.out.println("a get lock");
            try {
                TimeUnit.SECONDS.sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        });



        pool.execute(() -> {
            lock.lock();
            System.out.println("b get lock");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        });
        pool.shutdown();
    }


    public static void myLock() {
        class  MyLock extends AbstractQueuedSynchronizer {

        }
    }

}
