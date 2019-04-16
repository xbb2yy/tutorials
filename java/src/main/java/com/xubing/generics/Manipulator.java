package com.xubing.generics;

public class Manipulator<T> {
    private T t;
    public Manipulator(T t) {
        this.t = t;
    }

    public void manipulate() {
       // t.f();  can not compile
    }
}
