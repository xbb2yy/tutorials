package com.xubing.exceptions;

public class Main {

    public static void main(String[] args) {
        try {
            test();
        } catch (YourException e) {
            e.printStackTrace();
        }
        test1();
        test2();
    }



    public static void test() throws YourException {
        // 一定需要处理
        throw new YourException();
    }

    public static void test1() {
        // 不需要处理
        throw new MyException();
    }

    public  static void test2() throws NullPointerException {

    }
}
