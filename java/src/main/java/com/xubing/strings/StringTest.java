package com.xubing.strings;


import org.junit.Test;

import java.util.Arrays;
import java.util.Formatter;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/1 10:33
 */
public class StringTest {


    public void test() {
        StringBuilder str = new StringBuilder("123");
        StringBuilder str1 = str.append(str);
    }

    @Test
    public void testEquals() {
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);

        String c = new String("abc");
        System.out.println(a == c);

        String intern = c.intern();
        System.out.println(intern == a);

        String dd = new String("deeeed");
        System.out.println(dd.intern() == dd);
    }

    @Test
    public void testSub() {
        String str = "123456789340827199009262713";
        System.out.println(str.substring(9));
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

        new Formatter();
    }

    @Test
    public void test4() {
        String str = "123";
        String str1 = new String("123");
        String str2 = "123";

        System.out.println(str1 == str2);
        System.out.println(str == str2);

        String intern = str.intern();
        System.out.println(intern.getClass());
    }
}
