package com.xubing;

import com.xubing.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/15 16:40
 */

public class AnnotationConfigApplicationContextMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        String[] names = context.getBeanDefinitionNames();
        context.close();
    }
}
