package JavaConcurrencyInPractice.c5;

import java.util.HashMap;
import java.util.Map;

public class Memoizer1<A, V> implements Computable<A, V> {

    private final Map<A, V> cache = new HashMap<>();
    private final Computable<A, V> c;

    public Memoizer1(Computable<A, V> c) {
        this.c = c;
    }

    @Override
    public synchronized V compute(A a) throws InterruptedException {
        V result = cache.get(a);
        if (result == null) {
            result = c.compute(a);
            cache.put(a, result);
        }
        return result;
    }
}
