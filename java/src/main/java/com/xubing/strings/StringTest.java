package com.xubing.strings;


import org.junit.Test;

import java.util.Arrays;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/1 10:33
 */
public class StringTest {


    public void test() {
        StringBuilder str = new StringBuilder("123");
        StringBuilder str1 = str.append(str);
    }

    public void test1() {
        String str = "123";
    }

    public void test2() {

        String str = "123";
        for (int i = 0; i < 5; i++) {
            str = str + "123";
        }
    }

    public static void main(String[] args) throws Exception{
        char c = '\u4e2d';
        System.out.println(c); // 中
        System.out.println((int) c); // 20013
        String z = "中";
        System.out.println(Arrays.toString(z.getBytes("gbk")));
        System.out.println(Arrays.toString(z.getBytes("utf-8")));
        System.out.println(Arrays.toString(z.getBytes("ascii")));
        System.out.println(Arrays.toString("国".getBytes("ascii")));
    }

    @Test
    public void test3() {
        String s = new String("abc");
        String intern = s.intern();
        System.out.println(s == intern);
    }
}
