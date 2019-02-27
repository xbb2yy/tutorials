package com.xubing.generic.泛型接口;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class CoffeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] types = {Americano.class, Breve.class, Cappuccino.class, Lattte.class, Mocha.class};
    private static Random ran = new Random(47);
    private int size = 0;
    public CoffeGenerator() {}

    public CoffeGenerator(int size) {
        this.size = size;
    }
    @Override
    public Coffee next() {
        try {
            return (Coffee)types[ran.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Override
    public Iterator iterator() {
        return new CoffeeIterator();
    }

     private class CoffeeIterator implements Iterator {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeGenerator generator = new CoffeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }

        for (Coffee coffee : new CoffeGenerator(5)) {
            System.out.println(coffee);
        }
    }
}
