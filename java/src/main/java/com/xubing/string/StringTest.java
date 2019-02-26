package com.xubing.string;

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
}
