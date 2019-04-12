package com.xubing.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @author xubing xbbjava@163.com
 * @description TODO
 * @date 2018/5/30 14:40
 */
@Component
public class Person implements DisposableBean {

    public Person() {
        System.out.println("我被创建了");
    }

    public void introduction(String name) {
        System.out.println("my name is" + name);
    }

    @Override
    public void destroy() {
        System.out.println("我被销毁了");
    }
}
