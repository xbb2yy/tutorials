package com.xubing.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/1 16:00
 */
public class Animal implements BeanPostProcessor {

    private String name;

    public Animal() {
        System.out.println("constructor run");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor postProcessAfterInitialization");
        return bean;
    }


    public void setName(String name) {
        System.out.println("setter run");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
