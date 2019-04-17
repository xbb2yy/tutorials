package com.xubing.generics;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
    public static void main(String[] args) {
        Class<? extends ArrayList> c1 = new ArrayList<String>().getClass();
        Class<? extends ArrayList> c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
