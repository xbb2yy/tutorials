package com.xubing.stream;

import org.junit.Test;

import java.util.Optional;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/23 15:21
 */
public class OptionalTest {

    @Test
    public void test() {
        Apple test = new Apple(Apple.Color.BLANK, 10.0, Optional.of("test"));
        System.out.println(test);

        Apple apple = new Apple(Apple.Color.BLANK, 10.0, Optional.empty());
        System.out.println(apple);


    }
}
