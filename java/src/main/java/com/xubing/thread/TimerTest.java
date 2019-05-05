package com.xubing.thread;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerTest {

    public static void main(String[] args) {
        int i = 0;
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(LocalTime.now());
                throw new RuntimeException();
            }
        }, 2, 2000);

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        pool.scheduleAtFixedRate(() -> {
            System.out.println(LocalTime.now());
            throw new RuntimeException();
        }, 2, 2, TimeUnit.SECONDS);
    }
}
