package com.xubing.annotation;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/15 16:53
 */
@Service
public class BeanOne implements BeanNameAware, InitializingBean, BeanFactoryAware, ApplicationContextAware {

    public BeanOne() {
        System.err.println("BeanOne Constructor Initialized");
    }

    public void doSomthing() {
        System.out.println("Inside doSomthing() hahah of  Caret mnemonic");

    }

    private void init() {
        System.out.println("init...");
    }

    private void destroy() {
        System.out.println("destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext");
    }
}
