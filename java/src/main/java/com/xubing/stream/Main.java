package com.xubing.stream;


import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 16:25
 */
public class Main {


    @Test
    public void testSkip() {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 2);
        List<Integer> list = stream.skip(2).limit(5).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    @Test
    public void parrellelStreamSkipTest() {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 2);
        List<Integer> list = stream.parallel().skip(2).limit(5).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    @Test
    public void testPeek() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 8, 7);
       stream.peek(t -> t++).forEach(System.out::println);
    }
}
