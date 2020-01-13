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

    @Test
    public void test3() {
        String s = new String("abc");
        String intern = s.intern();
        System.out.println(s == intern);

        new Formatter();
    }

    @Test
    public void test4() {
        String s1 = new String("hello");
        String intern1 = s1.intern();
        String s2 = "hello";
        System.out.println(s1 == s2); // false
        String s3 = new String("hello") + new String("hello");
        String intern3 = s3.intern();
        String s4 = "hellohello";
        System.out.println(s3 == s4); // false
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "he" + "llo";
        String s4 = "hel" + new String("lo");
        String s5 = new String("hello");
        String s6 = s5.intern();
        String s7 = "h";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // true
        System.out.println(s1==s4); // false
        System.out.println(s1==s9); // false
        System.out.println(s4==s5); // false
        System.out.println(s1==s6); // true

    }
}
