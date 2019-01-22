package com.xubing.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/25 17:17
 */
public class RflectionTest {

    @Test
    public void test() {
        Method[] methods = String.class.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.isVarArgs());
            System.out.println("=================================");
        }

    }

    @Test
    public void testInvokeMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String str = "xubignbing";
        Method length = String.class.getMethod("length", null);
        Object invoke = length.invoke(str);
        System.out.println(invoke.getClass());
    }

    @Test
    public void testFields() {
        Field[] fields = String.class.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

    }

    @Test
    public void test1() throws Exception {
        Method[] methods = Person.class.getMethods();

        System.out.println(methods.length);
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("==========================");

        Method[] declaredMethods = Person.class.getDeclaredMethods();
        System.out.println(declaredMethods.length);
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());

        }

        Method sayHello = Person.class.getDeclaredMethod("sayHello", null);
        sayHello.setAccessible(true);
        sayHello.invoke(new Person());


        Constructor<Person> constructor = Person.class.getDeclaredConstructor(String.class, String.class);
        constructor.setAccessible(true);
        Person person = constructor.newInstance("1", "2");
        System.out.println(person);


        ClassLoader classLoader = Person.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
