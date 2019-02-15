package com.xubing.polymorphism;

public class Man extends Person{
    @Override
    public void eat() {
        System.out.println("man eat");
    }

    public static void sleep() {
        System.out.println("man sleep");
    }

    private void say() {
        System.out.println("man");
    }

    public static void main(String[] args) {
        Person p = new Man();
        Man m = new Man();
        p.eat();
        p.sleep();

        m.eat();
        m.say();
        m.sleep();

    }
}
