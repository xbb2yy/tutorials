package com.xubing;

import com.xubing.bean.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/1 15:58
 */
public class ClassPathXmlApplicationContextMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Cat bean = context.getBean(Cat.class);
        System.out.println(bean);
    }
}
