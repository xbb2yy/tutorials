package com.xubing.generics;

import com.xubing.generics.泛型接口.CoffeGenerator;
import com.xubing.generics.泛型接口.Coffee;
import com.xubing.generics.泛型接口.Generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class Generators {

    public static <T> Collection<T> fill(Collection<T> collection, Generator<T> col, int size) {
        for (int i = 0; i < size ; i++) {
            collection.add(col.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        Collection<Coffee> col = fill(new ArrayList<Coffee>(), new CoffeGenerator(), 10);
        for (Coffee coffee : col) {
            System.out.println(coffee);
        }

        Collection<Integer> fill = fill(new Vector<Integer>(), new Fibonacci(), 30);
        fill.forEach(System.out::println);
    }
}
