package JavaConcurrencyInPractice.c4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListHelpler<E> {
    public List<E> list = Collections.synchronizedList(new ArrayList<>());

    public boolean putIfAbsent(E e) {
        synchronized (list) {
            boolean contains = list.contains(e);
            if (!contains) {
                list.add(e);
            }
            return contains;
        }
    }
}
