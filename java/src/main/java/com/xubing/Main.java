package com.xubing;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/7/18 9:18
 */
public class Main {
    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Say o = (Say) Proxy.newProxyInstance(Say.class.getClassLoader(), new Class[]{Say.class}, new Handler(new Person()));
        o.say("123");

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        CglibHandler handler = new CglibHandler(new Person());
        enhancer.setCallback(handler);
        Person person = (Person) enhancer.create();
        person.say("test");


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



