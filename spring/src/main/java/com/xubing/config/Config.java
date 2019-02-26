package com.xubing.config;

import com.xubing.bean.BeanOne;
import com.xubing.bean.BeanTwo;
import com.xubing.bean.DogFactoryBean;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/14 10:44
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class Config {

    public Config() {
        System.out.println("Config 类被创建了");
    }

    @Bean
    public BeanOne beanOne() {
        BeanOne beanOne = new BeanOne();
        return beanOne;
    }

    @Bean
    public DogFactoryBean dogFactoryBean() {
        return new DogFactoryBean();
    }
}
