package com.xubing.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {

    private Class<T> type;

    public ArrayMaker(Class<T> type) {
        this.type = type;
    }

    T[] create(int size) {
        return (T[]) Array.newInstance(type, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> maker = new ArrayMaker<>(String.class);
        String[] integers = maker.create(10);
        System.out.println(Arrays.toString(integers));
    }
}
