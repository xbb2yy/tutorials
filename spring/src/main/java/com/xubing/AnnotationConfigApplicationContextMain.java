package com.xubing;

import com.sun.media.sound.SoftTuning;
import com.xubing.bean.BeanOne;
import com.xubing.bean.Dog;
import com.xubing.bean.DogFactoryBean;
import com.xubing.config.Config;
import com.xubing.config.LogAspect;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/15 16:40
 */

public class AnnotationConfigApplicationContextMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


    }
}
