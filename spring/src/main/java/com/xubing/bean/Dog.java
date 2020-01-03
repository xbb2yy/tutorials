package com.xubing.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/1 17:45
 */

public class Dog implements InitializingBean, DisposableBean, BeanNameAware, ApplicationContextAware {

    private String name;

    public Dog() {
        System.out.println("constructor");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        System.out.println("setName");
        this.name = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext aware");
    }

    @PostConstruct
    public void init() {
        System.out.println("init method");
    }
}
