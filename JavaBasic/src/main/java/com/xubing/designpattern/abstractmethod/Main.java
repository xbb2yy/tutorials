package com.xubing.designpattern.abstractmethod;

import com.xubing.designpattern.abstractmethod.factory.Factory;
import com.xubing.designpattern.abstractmethod.factory.Link;
import com.xubing.designpattern.abstractmethod.factory.Page;
import com.xubing.designpattern.abstractmethod.factory.Tray;
import com.xubing.designpattern.abstractmethod.listfactory.ListFactory;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 10:21
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new ListFactory();

        Link 百度一下 = factory.createLink("http://www.baidu.com", "百度一下");
        Link 新浪 = factory.createLink("http://www.sina.com", "新浪");
        Link 淘宝 = factory.createLink("http://www.taobao.com", "淘宝");


        Tray 导航 = factory.createTray("导航");
        导航.add(淘宝);
        导航.add(新浪);

        Tray 搜索 = factory.createTray("搜索");
        搜索.add(百度一下);

        Page page = factory.createPage("hao123", "bingbing");
        page.add(导航);
        page.add(搜索);

        page.output();
    }
}
