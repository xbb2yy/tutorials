package com.xubing.annotation;


import java.lang.reflect.Type;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/20 11:46
 */
@Test
public class Person {
    public static void main(String[] args) {
        Class<? extends Person> clazz = new Person().getClass();
        String name = clazz.getName();
        System.out.println(name);

        Type genericSuperclass = clazz.getGenericSuperclass();
        String typeName = genericSuperclass.getTypeName();
        System.out.println(typeName);
    }
}
