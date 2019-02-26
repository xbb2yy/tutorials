package com.xubing.lambda;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * @author xubing xbbjava@163.com
 * @className LambdaTest
 * @description lambda 学习
 * @date 2018/5/7 16:01
 */
public class LambdaTest {

    String[] strs = {"java", "lambda", "effective", "think", "Jvm", "test"};

    @Test
    public void test() {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() < o2.length() ? -1 : 1;
            }
        };

        Arrays.sort(strs, comparator);
        printStrs(strs);

    }

    @Test
    public void lambdaTest() {

        Arrays.sort(strs, (String s1, String s2) -> (s1.length() < s2.length() ? -1 : 1));
        printStrs(strs);

        Arrays.sort(strs, (String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 1;
            }
        });

    }

    @Test
    public void test2() {
        Comparator<String> comparator = (s1, s2) -> (s1.length() < s2.length() ? -1 : 1);

        Arrays.sort(strs, comparator);
        printStrs(strs);
    }

    @Test
    public void test3() {

        Runnable run = () -> System.out.println("hello lambda");
        Runnable run1 = System.out::println;

    }

    @Test
    public void test4() {

        Arrays.sort(strs, String::compareToIgnoreCase);

    }

    private void printStrs(String[] strs) {
        if (Objects.isNull(strs)) {
            return;
        }
        for (String str : strs) {
            System.out.println(str);
        }


        Stream.of(strs).parallel().sorted(String::compareToIgnoreCase);
    }

    @Test
    public void testThis() throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(1);

        int a = 3;
        System.out.println(this);
        System.out.println(a);


        final ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("--------------------");
                System.out.println(a);
                System.out.println(this);
                latch.countDown();
            }
        });

        latch.await();
        System.out.println("++++++++++++");
        pool.execute(() -> {
            System.out.println("inner");
            System.out.println(a);
            System.out.println(this);
        });
    }

    @Test
    public void testMethod() {
        Map<Integer, Integer> map = new HashMap<>(16);
        map.put(1, 2);
        map.put(4, 4);
        map.forEach(Math::add);
    }
}
