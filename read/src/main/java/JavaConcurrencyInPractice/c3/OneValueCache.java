package JavaConcurrencyInPractice.c3;

import java.math.BigInteger;
import java.util.Arrays;

public class OneValueCache {

    private final BigInteger last;
    private final BigInteger[] factors;

    public OneValueCache(BigInteger last, BigInteger[] factors) {
        this.last = last;
        this.factors = factors;
    }

    public BigInteger[] getFactors(BigInteger bigInteger) {
        if (last == null || !last.equals(bigInteger)) {
            return null;
        }
        return Arrays.copyOf(factors, factors.length);
    }
}
