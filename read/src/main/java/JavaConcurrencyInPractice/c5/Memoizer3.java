package JavaConcurrencyInPractice.c5;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Memoizer3<A, V> implements Computable<A, V> {

    private final Map<A, FutureTask<V>> cache = new ConcurrentHashMap<>();
    private final Computable<A, V> c;

    public Memoizer3(Computable<A, V> c) {
        this.c = c;
    }

    @Override
    public  V compute(A a) throws InterruptedException {
        FutureTask<V> f = cache.get(a);
        if (f == null) {
            FutureTask<V> ft = new FutureTask<V>(() -> c.compute(a));
            f = ft;
            // cache.put(a, ft);
            cache.put(a, ft);
            ft.run();
        }

        try {
            return f.get();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
