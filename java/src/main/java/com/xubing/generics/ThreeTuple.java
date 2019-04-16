package com.xubing.generics;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C c;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + "," + "c" + ")";
    }
}
