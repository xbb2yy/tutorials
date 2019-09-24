package com.xubing;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/20 14:34
 */
public class XmlBeanFactoryMain {

    public static void main(String[] args) throws Exception {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans3.xml"));

        xmlBeanFactory.getBean("dog");
    }
}
