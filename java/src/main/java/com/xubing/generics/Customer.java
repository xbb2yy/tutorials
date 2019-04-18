package com.xubing.generics;

import com.xubing.generics.泛型接口.Generator;

public class Customer {
    private static long count = 0;
    private final long id = count++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "customer:" + id;
    }

    public static Generator<Customer> generator() {
        return Customer::new;
    }

    public static void main(String[] args) {
        Customer customer = Customer.generator().next();
    }
}
