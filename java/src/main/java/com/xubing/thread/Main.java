package com.xubing.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5 ; i++) {
            pool.execute(() -> {
                for (int j = 0; j < 100000; j++) {
                    System.out.println(Counter.incrementAndGet());
                }
            });
        }

    }
}

class Counter {
    private static int i;

    public static int incrementAndGet() {
        return ++i;
    }
}
