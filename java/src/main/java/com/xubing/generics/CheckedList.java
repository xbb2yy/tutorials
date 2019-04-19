package com.xubing.generics;

import java.util.List;

public class CheckedList {

    static void oldStyleMethod(List probablyDog) {
        probablyDog.add(new Cat());
    }

    public static void main(String[] args) {

    }
}

class Cat{}
