package com.xubing.typoinfo;

public class GenericClassReferences {
    public static void main(String[] args) {
        Class<Integer> intClass = int.class;
        Class<Integer> integerClass = int.class;
        integerClass = Integer.TYPE;
        Class<? extends Number> clazz = long.class;

    }
}
