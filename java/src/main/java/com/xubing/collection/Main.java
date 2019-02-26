package com.xubing.collection;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/16 17:44
 */
public class Main {


    public static void main(String[] args) {
        LRU lru = new LRU();
        lru.put("1", "1");
        lru.put("2", "2");

        lru.forEach((k, v) -> System.out.println(k));
        lru.get("1");

        System.out.println("=========================");
        lru.put("3", "3");
        lru.forEach((k, v) -> System.out.println(k));

    }
}


class LRU extends LinkedHashMap<String, String> {

    private int max = 2;

    public LRU() {
        super(16, 0.75f, true);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        return size() > max;
    }
}