package com.xubing.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/20 9:56
 */
public class PersonFactory implements FactoryBean<Person> {
    /**
     * 工厂bean需要的时候才会被创建
     *
     * @return Person
     * @throws Exception
     */
    @Override
    public Person getObject() throws Exception {
        System.out.println("bean factory run");
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
