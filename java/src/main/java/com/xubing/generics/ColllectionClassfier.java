package com.xubing.generics;

import java.util.*;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/15 17:33
 */
public class ColllectionClassfier {

    public static String classify(Set<?> s) {
        return "set";
    }

    public static String classify(List<?> s) {
        return "list";
    }

    public static String classify(Collection<?> s) {
        return "collection";
    }

    public static void main(String[] args) {
        System.out.println(classify(new HashSet()));
        System.out.println(classify(new ArrayList()));
        System.out.println(classify(new HashMap<>(16).values()));
    }
}
