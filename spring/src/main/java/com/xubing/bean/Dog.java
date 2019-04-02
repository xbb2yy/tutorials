package com.xubing.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/1 17:45
 */

public class Dog implements InitializingBean {

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

}
