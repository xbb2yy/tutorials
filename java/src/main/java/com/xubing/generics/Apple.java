package com.xubing.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xubing xbbjava@163.com
 * @className Apple
 * @description
 * @date 2018/6/7 17:29
 */
public class Apple extends Fruit {

    public static void main(String[] args) throws Exception{

        /**
         不能编译
        List<Fruit> fruits = new ArrayList<Apple>();
        */
        List<? extends Fruit> fruits = new ArrayList<Apple>();
     /*
        不能编译通过
        fruits.add(new Fruit());
        fruits.add(new Apple());
        fruits.add(new Object());*/
        fruits.add(null);

        List<? extends Apple> apples = new ArrayList<Apple>();
       /**
        * 编译不通过
        *  apples.add(new Apple());
        *  apples.add(new Object());
        *  */
       Fruit[] f = new Apple[10];
       f[0] = new Apple();
       f[1] = new Fruit(); // 可以编译通过，运行时报错
        System.out.println(Arrays.toString(f));

    }

    public void fruit(Fruit fruit) {
        System.out.println("fruit");
    }

    public void fruit(Apple apple) {
        System.out.println("apple");
    }
}
