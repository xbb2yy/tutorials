package com.xubing.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class LiftOff implements Runnable {

    protected int countDown = 10;
    private  static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff") + ").";
    }

    public static void main(String[] args) {
        LiftOff liftOff = new LiftOff();
       // liftOff.run();

        Thread thread = new Thread(liftOff);
      //  thread.start();
        System.out.println("Waiting for lift off");
        for (int i = 0; i < 10 ; i++) {
           // new Thread(new LiftOff()).start();
        }

        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10 ; i++) {
            service.execute(new LiftOff());
        }

    }
}
