package com.xubing.generics;

public class Manipulator2<T extends HasF> {
    private T t;
    public Manipulator2(T t) {
        this.t = t;
    }
    public void manipulate() {
        t.f();
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Manipulator2<HasF1> hasF1Manipulator2 = new Manipulator2(new HasF1());
        HasF1 hasF = hasF1Manipulator2.get();
    }
}

class HasF1 extends HasF { }
