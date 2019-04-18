package com.xubing.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class New {

    public static <K, V> Map<K, V> map() {
        return new HashMap();
    }

    public static <E> List<E> list() {
        return new ArrayList<>();
    }

    static void f(Map<String, List<? extends CharSequence>> map){
    }

    public static void main(String[] args) {

        Map<String, List<? extends CharSequence>> map1 = new HashMap<>();

        Map<String, String> map = New.map();
        map.put("1", "1");


        List<String> list = New.list();
        list.add("23");


        f(new HashMap<>());
        // java8已经能编译通过，以下编译不通过
        f(New.map());
    }
}
