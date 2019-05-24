package JavaConcurrencyInPractice.c16;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PossibleReordering {
    static int x = 0, y = 0, a = 0, b = 0;

    public static void main(String[] args) throws InterruptedException {

        final CyclicBarrier barrier = new CyclicBarrier(2);
        Thread one = new Thread(() -> {
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            a = 1;
            x = b;
        });

        Thread other = new Thread(() -> {
            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            b = 1;
            y = a;
        });

        one.start(); other.start();
        one.join(); other.join();

        System.out.println("(" + x + "," + y + ")") ;
    }
}
