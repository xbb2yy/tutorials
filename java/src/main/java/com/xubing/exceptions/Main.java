package com.xubing.exceptions;

public class Main {


    public void test() throws YourException {
        // 一定需要处理
        throw new YourException();
    }

    public void test1() {
        // 不需要处理
        throw new MyException();
    }
}
