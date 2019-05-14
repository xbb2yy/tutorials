package JavaConcurrencyInPractice.c7;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator implements Runnable {

    private final List<BigInteger> primes = new ArrayList<>();
    private volatile boolean cancelled;
    @Override
    public void run() {
        BigInteger one = BigInteger.ONE;
        while (!cancelled) {
            one = one.nextProbablePrime();
            synchronized (this) {
                primes.add(one);
            }
        }
    }

    public void cancel() {
        cancelled = true;
    }

    public synchronized List<BigInteger> getPrimes() {
        return new ArrayList<>(primes);
    }
}
