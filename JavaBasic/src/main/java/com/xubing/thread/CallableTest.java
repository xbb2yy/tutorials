package com.xubing.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/28 16:33
 */
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(() -> {
            TimeUnit.SECONDS.sleep(100);
            return 1;
        });
        
        new Thread(task).start();

        Integer integer = task.get();
        System.out.println(integer);

    }
}
