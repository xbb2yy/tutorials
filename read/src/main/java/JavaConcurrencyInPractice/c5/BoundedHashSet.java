package JavaConcurrencyInPractice.c5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class BoundedHashSet<T> {
    private final Set<T> set;
    private final Semaphore semaphore;

    public BoundedHashSet(int bounds) {
        semaphore = new Semaphore(bounds);
        set = Collections.synchronizedSet(new HashSet<>());
    }

    public boolean add(T t) throws InterruptedException {
        semaphore.acquire();
        boolean wasAdded = false;
        try {
            wasAdded = set.add(t);
            return wasAdded;
        } finally {
            if (!wasAdded){
                semaphore.release();
            }
        }
    }

    public boolean remove(T t) {
        boolean remove = set.remove(t);
        if (remove) {
            semaphore.release();
        }
        return remove;

    }
}
