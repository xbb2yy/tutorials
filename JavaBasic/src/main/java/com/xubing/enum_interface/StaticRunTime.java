package com.xubing.enum_interface;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/23 12:18
 */
public class StaticRunTime {

    private static int i = 1;

    static {
        System.out.println("static block run");
    }

    public void test(long c, int i, int a, int d) {
        System.out.println(this);
        System.out.println(c);
        System.out.println(i);
        System.out.println(a);
        System.out.println(d);
    }

}
