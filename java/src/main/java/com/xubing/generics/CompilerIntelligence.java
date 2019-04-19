package com.xubing.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {

    public static void main(String[] args) {
        List<? extends Apple> list = Arrays.asList(new Apple());
        // list.add(new Apple()) error  https://stackoverflow.com/questions/2776975/how-can-i-add-to-list-extends-number-data-structures
        Apple apple = list.get(0);
        list.contains(new Apple());

        List<? super Fruit> fruit = new ArrayList<Object>();
        fruit.get(0);
        fruit.add(new Apple());

    }
}
