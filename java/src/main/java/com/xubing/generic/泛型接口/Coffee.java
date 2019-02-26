package com.xubing.generic.泛型接口;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/10 11:47
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
