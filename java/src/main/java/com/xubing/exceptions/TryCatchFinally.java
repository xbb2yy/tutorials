package com.xubing.exceptions;

import org.junit.Test;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/7/2 14:04
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        int i = test2();
        System.out.println(i);
    }


    @Test
    public void test() {
        int a = 3;
        try {

            a++;
            System.out.println(a);
            throw new Exception();
        } catch (Exception e) {
            a++;
            System.out.println(a);
        } finally {
            a++;
            System.out.println(a);
        }
        System.out.println(a);
    }


    public static int test1() {
        int a;
        try {
            a = 1;
            /* System.out.println(a); */
            System.out.println(a / 0);
            return a;

        } catch (Exception e) {
            a = 2;
            System.out.println(a);
            return a;

        } finally {
            a = 10;
            System.out.println(a);
        }

    }

    public static int test2() {
        int a;
        try {
            a = 1;
            /* System.out.println(a); */
            System.out.println(a / 0);
            return a;

        } catch (Exception e) {
            a = 2;
            System.out.println(a);
            return a;

        } finally {
            a = 10;
            System.out.println(a);
            return a;
        }
    }

    public static int test3() {

        return 1;
    }

}
