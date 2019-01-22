package com.xubing.construtor;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/31 12:00
 */
public class Person {

    public String name = "person";
    private String age;
    public static String birth = "1990";
    public final String country = "cn";

    public Person() {
        System.out.println("Person init..");
    }

    public static void say() {
        System.out.println("Person say");
    }

    public void run() {
        System.out.println("Person run");
    }

    public void say(String name) {
        System.out.println("Person: " + name + " say");
    }

    public String hello() {
        return "hello";
    }

    public static int i;


}
