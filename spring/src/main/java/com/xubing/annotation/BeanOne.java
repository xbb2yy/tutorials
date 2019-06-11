package com.xubing.annotation;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/15 16:53
 */
@Service
public class BeanOne implements BeanNameAware, InitializingBean, BeanFactoryAware, ApplicationContextAware, DisposableBean {

    public BeanOne() {
        System.out.println("BeanOne Constructor Initialized");
    }

    public void doSomthing() {
        System.out.println("Inside doSomthing() hahah of  Caret mnemonic");

    }

    private void init() {
        System.out.println("init...");
    }

    public void destroy() {
        System.out.println("destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("beanOne setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanOne setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("beanOne setApplicationContext");
    }

}
