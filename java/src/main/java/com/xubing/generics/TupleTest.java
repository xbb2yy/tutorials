package com.xubing.generics;

public class TupleTest {

    static TwoTuple f() {
        return new TwoTuple(1, "s");
    }

    static TwoTuple<String, Integer> g() {
        return new TwoTuple<String, Integer>("2", 1);
    }

    static TwoTuple<String, Integer> h() {
        return new TwoTuple<>("2", 1);
    }

    static <T> T t(T t) {
        return t;
    }

    public static void main(String[] args) {

        Integer t = t(1);

        TwoTuple<String, Integer> g = g();
        System.out.println(g);
        String a = g.a;

        TwoTuple<Integer, String> f = f();
        Integer a1 = f.a;

        TwoTuple f1 = f();
        Object a2 = f1.a;

    }
}
