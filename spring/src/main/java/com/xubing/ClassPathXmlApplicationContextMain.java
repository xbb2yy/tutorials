package com.xubing;

import com.xubing.bean.Animal;
import com.xubing.bean.Dog;
import com.xubing.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/1 15:58
 */
public class ClassPathXmlApplicationContextMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person animal = context.getBean(Person.class);
        System.out.println(animal.getName());

        context.registerShutdownHook();
    }
}
