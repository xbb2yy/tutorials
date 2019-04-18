package com.xubing.generics;

public class EraseAndInheritance {
    public static void main(String[] args) {
        Derived<String> derived = new Derived<>();
        String s = derived.get();
        Derived2 d2 = new Derived2();
        d2.set(1);
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

class Derived2 extends GenericBase{}

// no wildcard expected
class Derived3 extends  GenericBase<String>{}