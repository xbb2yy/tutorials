package com.xubing.spring.config;

import com.xubing.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xubing xbbjava@163.com
 * @className JavaConfig
 * @description TODO
 * @date 2018/5/30 14:42
 */
@Configuration
@ComponentScan(basePackages = "com.xubing.spring")
public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        Person person = context.getBean(Person.class);
        person.introduction("xubing");
        ((AnnotationConfigApplicationContext) context).close();
    }
}
