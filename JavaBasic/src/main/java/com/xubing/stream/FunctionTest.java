package com.xubing.stream;


import org.junit.Test;

import java.util.function.BiConsumer;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/22 16:38
 */
public class FunctionTest {


    @Test
    public void testBiConsumer() {
        BiConsumer<Integer, Integer> consumer = (Integer str, Integer str1) -> {
            System.out.println(str + str1);
        };

        BiConsumer<Integer, Integer> consumer1 = (Integer str, Integer str1) -> {
            System.out.println(str);
            System.out.println(str1);
        };

        consumer.andThen(consumer1).accept(1, 2);
    }

    public void add(int i) {
        i = 6;
    }

    public void get(int i) {
        add(i);
        System.out.println(i);
    }

    public static void main(String[] args) {
        new FunctionTest().get(3);
    }

}
