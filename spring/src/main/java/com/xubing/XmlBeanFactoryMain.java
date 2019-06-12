package com.xubing;

import com.xubing.bean.Person;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.naming.Name;
import java.io.FileInputStream;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/20 14:34
 */
public class XmlBeanFactoryMain {

    public static void main(String[] args) throws Exception{
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans3.xml"));

        xmlBeanFactory.getBean("dog");
    }
}
