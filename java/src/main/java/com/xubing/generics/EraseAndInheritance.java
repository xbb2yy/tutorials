package com.xubing.generics;

import org.junit.Test;

public class EraseAndInheritance {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object o = d2.get();
        d2.set("2342");
    }

}

class GenericBase<T> {
    private T element;
    void set(T arg) {
        this.element = arg;
    }

     T get() {
        return element;
    }



}

class Derived<T> extends GenericBase<T>{}

class Derived2<T> extends GenericBase{}

// no wildcard expected
// class Derived3 extends  GenericBase<? extends String>{}