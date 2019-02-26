package com.xubing.config;

import org.springframework.context.ApplicationEvent;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/20 14:56
 */
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }
}
