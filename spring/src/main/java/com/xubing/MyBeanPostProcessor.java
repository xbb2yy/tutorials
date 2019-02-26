package com.xubing;

import com.xubing.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/23 16:09
 */
public class MyBeanPostProcessor implements BeanPostProcessor, BeanFactoryPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        Person p = null;
        if (bean instanceof Person) {
            p = (Person) bean;
            p.setName("bean bean");
        }
        System.out.println("postProcessBeforeInitialization");
        return p;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        return null;
    }


    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("beanfactory");
    }
}
