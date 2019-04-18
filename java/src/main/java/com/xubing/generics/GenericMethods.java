package com.xubing.generics;

import java.math.BigDecimal;
import java.util.ArrayList;

public class GenericMethods<T> {
    public static <T, R, V> T f(T t, R r, V v) {
        System.out.println(t.getClass().getSimpleName());
        System.out.println(r.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
        return t;
    }


    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods<String>();
        String f = methods.f(" ", 2, new BigDecimal(1));
        Integer f1 = methods.f(1, 1, 1);
        methods.f(1.0, 2, 2);
        methods.f(new ArrayList<>(), 2, 4);
        GenericMethods f2 = methods.f(new GenericMethods(), 2, 4);
    }
}
