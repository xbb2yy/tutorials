package com.xubing.bean;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/14 10:38
 */

public class Person implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean {

    // implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean, BeanPostProcessor


    public Person() {
        // 1
        System.out.println("构造器初始化中");
    }

    @Getter
    private String name;
    private Integer id;

    /**
     * InitializingBean 中需要实现的
     * 属性值的set方法执行完毕后,改方法会被调用
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        // 4
        System.out.println("InitializingBean afterPropertiesSet run...");
    }

    /**
     * BeanFactoryAware 中的方法
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        // 3
        System.out.println("BeanFactoryAware setBeanFactory run...");
    }

    /**
     * BeanNameAware要实现的方法
     *
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        // 2
        System.out.println("BeanNameAware setBeanName run...");

    }

    /**
     * DisposableBean 要实现的方法
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        // 容器关闭执行的方法
        System.out.println("DisposableBean destroy run...");
    }

    public void setName(String name) {
        System.out.println("set name");
        this.name = name;
    }


}
