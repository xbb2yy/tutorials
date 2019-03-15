package com.xubing.stream;

import com.sun.media.jfxmedia.logging.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * @author xubing xbbjava@163.com
 * @description java8 stream 学习
 * @date 2018/5/8 15:24
 */
public class StreamTest {

    private Map<String, String> map = new HashMap<>();
    private List<String> list = new ArrayList<>();


    static class Add{
        public int total;

        public  void add(int n) {
            total += n;
        }
    }


    interface Task {
        void execute();
    }

    static void doSomething(Task task){
        task.execute();
    }

    static void doSomething(Runnable task){
        task.run();
    }

    public static void main(String[] args) {
        // compile error
        // doSomething(() -> System.out.println(1));
        Add add = new Add();
        IntStream.rangeClosed(1, 100).parallel().forEach(add::add);
        System.out.println(add.total);
    }

    public void test2() {
        int a = 2;
        Runnable r = () -> {
            System.out.println(a);
        };
    }

    @Before
    public void addMap() {

        map.put("9.5", "think in java");
        map.put("9.2", "effective java");
        map.put("8.5", "并发编程的艺术");
        map.put("8.5", "c premier");
        map.put("8.8", "spring in action");
        map.put("8.7097", "hadoop guide");


        list.addAll(map.values());
    }

    @Test
    public void test() {
        for (String s : map.keySet()) {
            System.out.println(s);
        }
    }

    @Test
    public void testForeach() {

        list.forEach(System.out::println);

        map.forEach((k, v) -> System.out.println(k + ":" + v));


    }

    @Test
    public void forEachOrderedTest() {
        list.stream().forEachOrdered(System.out::println);
    }

    @Test
    public void filterTest() {
        Stream.of(1, 4, 6, 67, 7, 45, 23, 12, 45).filter(x -> x > 23).forEach(System.out::println);
    }

    @Test
    public void mapTest() {
        List<Integer> collect = Stream.of(1, 4, 7, 8).map(x -> x * x).collect(toList());
        System.out.println(collect.getClass());
    }

    @Test
    public void mapToIntTest() {
        Stream.of(1, 4, 7, 8).mapToInt(x -> x * x + 2).forEach(System.out::println);
    }

    @Test(timeout = 1000)
    public void distinctTest() {
        try {
            Thread.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Stream.of("aaa", "ddd", "ffed", "aaa").distinct().forEach(System.out::println);
    }

    @Test
    public void testPeek() {
        Stream.of("123", "456").peek(System.out::println).forEach(s -> System.out.println(s));
        map.forEach((String y, String x) -> System.out.println(x + y));
    }

    @Test
    public void testCollect() {
        Map<Integer, String> collect = list.stream().collect(toMap(String::length, t -> t.toUpperCase()));
        System.out.println(collect);


    }

    @Test
    public void money() {
        Map<Integer, Integer> map = Stream.iterate(1, item -> item + 1).limit(100).collect(toMap(x -> x, x -> 100));

        for (int i = 0; i < 10000; i++) {
            Optional<Integer> minus = map.keySet().stream().filter(key -> map.get(key) > 0).findAny();
            Optional<Integer> plus = map.keySet().stream().filter(key -> !key.equals(minus.get())).findAny();
            map.put(minus.get(), map.get(minus.get()) - 1);
            map.put(plus.get(), map.get(plus.get()) + 1);
        }

        map.values().stream().sorted().forEach(System.out::println);
    }


    @Test
    public void testIterate() {
        Stream.iterate(2, x -> x + 2).limit(100).parallel().forEach(System.out::println);
    }

    @Test
    public void testFlatMap() {
        Stream<List<Integer>> listStream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));

        listStream.flatMap(x -> x.stream()).forEach(System.out::println);
    }
    
    @Test
    public void testFindFirst() {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 2);
    }

    @Test
    public void testFiles() {

    }

    Optional<String> reduce = list.stream().reduce((x, y) -> x.length() < y.length() ? x : y);

}



