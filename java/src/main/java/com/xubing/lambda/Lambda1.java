package com.xubing.lambda;

public class Lambda1 {

   private int i = 1;

    public void test() {
       // int i = 2;
        Runnable r = () -> System.out.println(i);
        i = 3;
        r.run();
    }

    public static void main(String[] args) {
        Lambda1 lambda1 = new Lambda1();
        lambda1.test();
        System.out.println(lambda1.i);
    }
}
