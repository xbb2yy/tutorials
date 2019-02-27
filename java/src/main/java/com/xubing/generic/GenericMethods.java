package com.xubing.generic;

import java.math.BigDecimal;
import java.util.ArrayList;

public class GenericMethods {
    public  <T, R, V>  void  f(T t, R r, V v){
        System.out.println(t.getClass().getSimpleName());
        System.out.println(r.getClass().getSimpleName());
        System.out.println(v.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods methods = new GenericMethods();
        methods.f(" ", 2, new BigDecimal(1));
        methods.f(1, 1,  1);
        methods.f(1.0, 2, 2);
        methods.f(new ArrayList<>(), 2, 4);
    }
}
