package com.xubing.stream;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author xubing xbbjava@163.com
 * @className AppleStreamTest
 * @description TODO
 * @date 2018/5/31 9:42
 */
public class AppleStreamTest {
    private static List<Apple> list = new ArrayList<>();
    private static Map<String, Object> map = new HashMap();

    static {
        list.add(new Apple(Apple.Color.BLANK, 10D));
        list.add(new Apple(Apple.Color.YELLOW, 20D));
        list.add(new Apple(Apple.Color.BLANK, 18D));
        list.add(new Apple(Apple.Color.GREEN, 6D));
        list.add(new Apple(Apple.Color.GREEN, 15D));

        map.put("1", 1);
        map.put("2", 2);
    }

    @Test
    public void test() {
        Consumer<Apple> con = System.out::println;
        Comparator<String> com = Comparator.comparingInt(String::length);
        list.stream().filter(x -> x.getColor().equals(Apple.Color.BLANK)).forEach(con.andThen(x -> System.out.println(x.getColor())));

        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

    }

    @Test
    public void testRemoveIf() {
        list.removeIf(x -> x.getColor().equals(Apple.Color.BLANK));
        list.stream().forEach(System.out::println);
    }

    @Test
    public void testSpliterator() {

        Spliterator<Apple> spliterator = list.spliterator();
        int characteristics = spliterator.characteristics();
        System.out.println(characteristics);
        long l = spliterator.estimateSize();
        System.out.println(l);

        spliterator.forEachRemaining(System.out::println);
        System.out.println("============================");
        spliterator.tryAdvance(System.out::println);

        spliterator.trySplit().forEachRemaining(System.out::println);
    }

    @Test
    public void testReplaceAll() {
        list.replaceAll(x -> {
            if (x.getWeight() < 10D) {
                x.setWeight(88D);
                return x;
            } else {
                return x;
            }
        });

        list.forEach(System.out::println);
    }

    /**
     * Stream 分组测试
     */
    @Test
    public void testGroup() {
        Map<Apple.Color, List<Apple>> collect = list.stream().collect(Collectors.groupingBy(Apple::getColor));
    }

    @Test
    public void testReduce() {
        Optional<Apple> apple = list.stream().reduce((x, y) -> {
            x.setWeight(x.getWeight() + y.getWeight());
            return x;
        });

        Optional<Apple> optionalApple = list.stream().reduce((x, y) -> x.getWeight() < y.getWeight() ? x : y);
        optionalApple.ifPresent(System.out::println);

        apple.ifPresent(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++");

        list.stream().forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++");

        final Apple reduce = list.stream().reduce(new Apple(Apple.Color.BLANK, 10D), (x, y) -> {
            x.setWeight(x.getWeight() + y.getWeight());
            return x;
        });
        System.out.println(reduce);

        System.out.println("+++++++++++++++++++++++++++++");
        list.stream().forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++");
        Double sum = list.stream().reduce(5D, (x, y) -> x + y.getWeight(), (x, y) -> x + y);
        System.out.println(sum);
        System.out.println("+++++++++++++++++++++++++++++");
        list.stream().forEach(System.out::println);

    }

    @Test
    public void testCollect() {
        List<String> list = Arrays.asList("xubing", "jiangyuan", "love", "test", "hha", "collect");
        StringBuilder collect = list.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(collect);
    }
}
