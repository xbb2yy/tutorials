package JavaConcurrencyInPractice.c1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class SafeSequence {

    private AtomicLong atomicLong = new AtomicLong(0);

    public long getAndIncrement() {
        return atomicLong.getAndIncrement();
    }

    public static void main(String[] args) {

        SafeSequence sequence = new SafeSequence();
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5 ; i++) {
            pool.execute(() ->{
                for (int j = 0; j < 10000 ; j++) {
                    System.out.println(sequence.getAndIncrement());
                }
            });
        }
    }
}
