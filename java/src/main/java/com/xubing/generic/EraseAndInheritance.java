package com.xubing.generic;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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