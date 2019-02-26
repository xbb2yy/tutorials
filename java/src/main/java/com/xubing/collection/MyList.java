package com.xubing.collection;

import java.util.Iterator;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/7/18 17:37
 */
public class MyList implements Iterable {


    Iterator it = new MyIt();


    @Override
    public Iterator iterator() {
        return it;
    }

    private static class MyIt implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

}
