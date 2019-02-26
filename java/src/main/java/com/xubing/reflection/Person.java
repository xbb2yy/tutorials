package com.xubing.reflection;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/25 17:35
 */
public class Person {
    private String id;
    public String name;

    public Person() {

    }

    private Person(String id, String name) {
    }

    private void sayHello() {
        System.out.println("hello, privete method");
    }

    public void sayLove() {
        System.out.println("love, public method");
    }
}
