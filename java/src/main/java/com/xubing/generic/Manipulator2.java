package com.xubing.generic;

public class Manipulator2<T extends HasF> {
    private T t;
    public Manipulator2(T t) {
        this.t = t;
    }

    public void manipulate() {
        t.f();
    }
}
