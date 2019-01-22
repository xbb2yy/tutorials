package com.xubing.collection;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.Callable;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/21 11:16
 */
public class MapTest {

    public static void main(String[] args) throws InterruptedException {
        Map<String, String> map = new HashMap<>(2);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                new Thread(() -> {
                    map.put(UUID.randomUUID().toString(), "1");
                }).start();
            }
        });

        t.start();
        t.join();

        System.out.println(map);
    }

    public static final int INT = 10;
    Map<String, Integer> map;

    @Before
    public void before() {
        map = new HashMap<>(16);
        for (int i = 0; i < INT; i++) {
            map.put("" + i, i * i + 2);
        }

    }


    @Test
    public void testPut() {
        HashMap<String, String> map = new HashMap<>();
    }


    @Test
    public void testGetOrDefault() {
        Map<String, String> map = new HashMap<>();
        map.put("1", null);
        String s = map.getOrDefault("1", " ").toString();
        String s1 = map.getOrDefault("2", "");
        System.out.println(s);
        System.out.println(s1);
    }

    /**
     * merge相当于执行了这些操作
     * V oldValue = map.get(key);
     * * V newValue = (oldValue == null) ? value :
     * *              remappingFunction.apply(oldValue, value);
     * * if (newValue == null)
     * *     map.remove(key);
     * * else
     * *     map.put(key, newValue);
     */
    @Test
    public void testMerge() {

        // oldValue 存在，就执行传递的方法
        map.merge("2", 3, (x, y) -> x + y);
        System.out.println(map.get("2"));

        // oldValue 为null， 设置为value
        map.merge("10", 4, (x, y) -> x + y);
        System.out.println(map.get("10"));

        // oldValue 存在，执行方法后为null，则移除键
        map.merge("1", 2, (x, y) -> null);


        Assert.assertFalse(map.containsKey("1"));

    }

    @Test
    public void testCompute() {
        map.computeIfPresent("3", (key, oldValue) ->
                key.length() + oldValue + 1
        );
        System.out.println(map.get("3"));

        map.computeIfAbsent("11", x -> x.length());
        map.computeIfAbsent("2", x -> x.length());

        System.out.println(map.get("11"));
        System.out.println(map.get("2"));

        Optional<Object> optional = Optional.ofNullable(null);
        boolean present = optional.isPresent();
        System.out.println(present);

    }

    @Test
    public void testContains() {
        boolean b = map.containsKey(null);
        System.out.println(b);

    }

}
