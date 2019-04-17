package com.xubing.generics;

public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T a) {
        this.value = a;
    }

    public void set(T a) {
        this.value = a;
    }

    public T get() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
       Holder<Apple> apple = new Holder(new Apple());
        Apple apple1 = apple.get();
        apple.set(new Jonathan());

        // Holder<Fruit> fruitHolder = apple; 编译错误

        Holder<? extends Fruit> fruit = apple;
        Fruit fruit1 = fruit.get();

        // fruit.set(new Apple());
    }
}
