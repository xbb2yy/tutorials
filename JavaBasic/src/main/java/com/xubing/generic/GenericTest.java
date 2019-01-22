package com.xubing.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xubing xbbjava@163.com
 * @className GenericTest
 * @description TODO
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
