package com.xubing.lambda;

import lombok.Data;

/**
 * @author xubing xbbjava@163.com
 * @className Person
 * @description TODO
 * @date 2018/5/8 18:38
 */

@Data
public class Person {

    private String id;


    public Person(String id) {
        this.id = id;
        System.out.println("我的id：" + id);
    }

}
