package com.xubing.util;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author xubing xbbjava@163.com
 * @className Rename
 * @description TODO
 * @date 2018/5/9 9:11
 */
public class Rename {

    private final static Pattern PATTERN = Pattern.compile("[www\\.javaxxz\\.com]");

    public static void main(String[] args) {

        File file = new File("F:\\基于ElasticSearch的找房网实战开发企业级房屋搜索网");

        File[] files = file.listFiles();

        Arrays.stream(files).filter(x -> x.getName().matches("IT教程大全.*")).forEach(x -> x.
                renameTo(new File("F:\\基于ElasticSearch的找房网实战开发企业级房屋搜索网\\" + x.getName().replaceAll("IT教程大全", ""))));
    }
}
