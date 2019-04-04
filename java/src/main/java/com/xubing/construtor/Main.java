package com.xubing.construtor;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 14:55
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Man();
        p.run();
        p.say("i am man");
        String s = p.hello();
        System.out.println(s);
    }
}
