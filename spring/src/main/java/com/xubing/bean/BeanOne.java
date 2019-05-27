package com.xubing.bean;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/15 16:53
 */
@Data
public class BeanOne  {


    private String id = "1";


    public BeanOne() {

        System.err.println("BeanOne Constructor Initialized");
    }

    public void doSomthing() {
        System.out.println("Inside doSomthing() hahah of  Caret mnemonic");

    }

}
