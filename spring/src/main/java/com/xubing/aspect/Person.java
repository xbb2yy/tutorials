package com.xubing.aspect;

import org.springframework.stereotype.Component;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/23 14:55
 */
@Component
public class Person implements Human {

    @Override
    public void say() {
        System.out.println("i am a person");
    }
}
