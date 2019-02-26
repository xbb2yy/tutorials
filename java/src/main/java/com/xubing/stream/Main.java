package com.xubing.stream;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 16:25
 */
public class Main {

    public void test() {

        Runnable run = System.out::println;
        run.run();

        Runnable r = () -> {
            int a = 0;
        };

        r.run();
    }
}
