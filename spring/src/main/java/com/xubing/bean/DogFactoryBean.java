package com.xubing.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/29 16:15
 */
public class DogFactoryBean implements FactoryBean<Dog> {

    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
