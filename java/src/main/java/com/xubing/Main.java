package com.xubing;

import com.xubing.reuse.Man;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;

import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/7/18 9:18
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Document doc = DocumentHelper.parseText("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Result>\n" +
                "\t<Code>1</Code><!-- 0:成功  其他失败 -->\n" +
                "\t<Message>SUCCESS</Message>\n" +
                "</Result>\n");
        System.out.println(doc.getRootElement().elementText("Code"));
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

    public static boolean IsIntByChar(String str) {
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

    public static void main(String[] args) throws Exception {
        /*String s = "中国";

        String s1 = new String("中国");
        byte[] bytes = s.getBytes("gbk");
        System.out.println(new String(bytes));
        System.out.println(Arrays.toString(bytes));

        InputStream in = Main.class.getResourceAsStream("a.txt");
        Scanner scanner = new Scanner(in);
        System.out.println(scanner.nextLine());*/

        System.out.println((char)999999999);
    }
}



