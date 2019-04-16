package com.xubing.generics;

public class Holder<T> {
    private T a;

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return this.a;
    }

    public static void main(String[] args) {
        Holder<String> holder = new Holder<>();
        holder.set("bing");
        String s = holder.get();
        System.out.println(s);
    }
}
