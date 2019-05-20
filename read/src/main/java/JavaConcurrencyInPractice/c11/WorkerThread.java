package JavaConcurrencyInPractice.c11;

import java.util.concurrent.BlockingQueue;

public class WorkerThread extends Thread {

    private final BlockingQueue<Runnable> queue;

    public WorkerThread(BlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Runnable runnable = queue.take();
                runnable.run();
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
