package JavaConcurrencyInPractice.c5;

import java.math.BigInteger;

public class ExpensiveFunction implements Computable<String, BigInteger> {
    @Override
    public BigInteger compute(String s) throws InterruptedException {
        return new BigInteger(s);
    }
}
