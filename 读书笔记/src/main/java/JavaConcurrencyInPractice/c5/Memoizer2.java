package JavaConcurrencyInPractice.c5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Memoizer2<A, V> implements Computable<A, V> {

    private final Map<A, V> cache = new ConcurrentHashMap<>();
    private final Computable<A, V> c;

    public Memoizer2(Computable<A, V> c) {
        this.c = c;
    }

    @Override
    public  V compute(A a) throws InterruptedException {
        V result = cache.get(a);
        if (result == null) {
            result = c.compute(a);
            cache.put(a, result);
        }
        return result;
    }
}
