package JavaConcurrencyInPractice.c4;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Not Thread Safe
 */
public class NumberRange {
    private final AtomicInteger lower = new AtomicInteger(0);
    private final AtomicInteger higher = new AtomicInteger(0);

    public void setLower(int i) {
        if (i > higher.get()) {
            throw new IllegalArgumentException();
        }
        lower.set(i);
    }

    public void setHigher(int i) {
        if (i < lower.get()) {
            throw new IllegalArgumentException();
        }
        higher.set(i);
    }

    public boolean isIn(int i) {
        return i >= lower.get() && i <= higher.get();
    }

}
