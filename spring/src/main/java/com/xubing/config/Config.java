package com.xubing.config;

import com.xubing.annotation.BeanOne;
import org.springframework.context.annotation.*;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/14 10:44
 */
@Configuration
//@EnableAspectJAutoProxy
@ComponentScan("com.xubing.annotation")
public class Config {

    public Config() {
        System.out.println("Config 类被创建了");
    }
}
