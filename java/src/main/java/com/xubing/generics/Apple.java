package com.xubing.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author xubing xbbjava@163.com
 * @className Apple
 * @description
 * @date 2018/6/7 17:29
 */
public class Apple extends Fruit {

    public static void main(String[] args) throws Exception{
        Fruit apple = new Apple();
        ((Apple) apple).fruit(apple);
    }

    public void fruit(Fruit fruit) {
        System.out.println("fruit");
    }

    public void fruit(Apple apple) {
        System.out.println("apple");
    }
}
