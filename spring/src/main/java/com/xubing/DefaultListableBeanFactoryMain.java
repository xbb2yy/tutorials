package com.xubing;

import com.xubing.bean.Person;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/7/23 15:50
 */
public class DefaultListableBeanFactoryMain {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        System.out.println(factory.getBean(Person.class));
    }
}
