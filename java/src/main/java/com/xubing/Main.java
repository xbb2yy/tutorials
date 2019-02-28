package com.xubing;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/7/18 9:18
 */
public class Main {
    public static void main(String[] args) {
        String str = "abcdefghijkl";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++)
            StringUtils.isNumeric(str);
        long endTime = System.currentTimeMillis();
        System.out.print("ByException: ");
        System.out.println(endTime - startTime);

    }

    public static boolean IsInt(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean IsIntbByRegrex(String str) {
        return str.matches("^-?\\d+$");
    }

    public static boolean IsIntByChar(String str)
    {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c <= '/' || c >= ':') {
                return false;
            }
        }
        return true;
    }
}


interface Say {
    String say(String string);
}

class Handler implements InvocationHandler {

    private Object person;

    public Handler(Object person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = method.invoke(person, new Object[]{"hello"});
        System.out.println("after");
        return result;
    }
}

class CglibHandler implements MethodInterceptor {

    private Object real;

    public CglibHandler(Object real) {
        this.real = real;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib before");
        return method.invoke(real, objects);
    }
}


class Person implements Say {
    @Override
    public String say(String string) {
        System.out.println("hello, proxy");
        return "hello";
    }

    public static void main(String[] args) {
        Person person = new Person();
        try {
            Method method = Say.class.getMethod("say", new Class[]{String.class});
            method.invoke(person, "test");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}



