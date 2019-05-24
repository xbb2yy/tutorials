package JavaConcurrencyInPractice.c1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnSafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }

    public static void main(String[] args) {

        UnSafeSequence sequence = new UnSafeSequence();
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5 ; i++) {
            pool.execute(() ->{
                for (int j = 0; j < 10000 ; j++) {
                    System.out.println(sequence.getNext());
                }
            });
        }
        pool.shutdown();
    }
}
