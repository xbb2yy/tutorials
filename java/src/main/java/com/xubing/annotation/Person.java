package com.xubing.annotation;


import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/20 11:46
 */
@Test
public class Person <T>{
    public static void main(String[] args) {
        Class<? extends Person> clazz = new Female().getClass();
        String name = clazz.getName();
        System.out.println(name);

        Type genericSuperclass = clazz.getGenericSuperclass();

        System.out.println(clazz.getTypeName());
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType) genericSuperclass;
            Type[] typeArguments = type.getActualTypeArguments();
            Type ownerType = type.getOwnerType();
            Type rawType = type.getRawType();
            Type typeArgument = typeArguments[0];
        }
        String typeName = genericSuperclass.getTypeName();
        System.out.println(typeName);
    }
}
