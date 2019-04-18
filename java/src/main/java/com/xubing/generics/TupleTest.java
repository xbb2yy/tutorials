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

    public static void main(String[] args) {
        TwoTuple<String, Integer> g = g();
        System.out.println(g);

        TwoTuple f = f();
        System.out.println(f);
        System.out.println(f.a.getClass().getSimpleName());
    }
}
