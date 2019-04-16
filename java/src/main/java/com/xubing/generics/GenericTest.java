package com.xubing.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xubing xbbjava@163.com
 * @description
 * @date 2018/6/7 17:30
 */
public class GenericTest {

    public static void main(String[] args) {

    }

    @Test
    public void test() {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
    }

}
