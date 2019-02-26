package com.xubing.construtor;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/31 12:01
 */
public class Man extends Person {

    public String name = "man";
    public String car = "BMW";
    public String country = "en";


    public Man() {
        System.out.println("Man init...");
    }

    @Override
    public void say(String name) {
        System.out.println(name + " say");
    }

    public static void say() {
        System.out.println("Man say");
    }
}
