package com.xubing.generics;

import java.util.Iterator;

/**
 * @author xubingbing
 * 适配器模式
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

    private int n;

    public IterableFibonacci(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                // 调用外部类的next()方法
                return IterableFibonacci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer i : new IterableFibonacci(8)) {
            System.out.println(i);
        }
    }
}
