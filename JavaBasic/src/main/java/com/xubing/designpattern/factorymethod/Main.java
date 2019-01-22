package com.xubing.designpattern.factorymethod;

import com.xubing.designpattern.factorymethod.framework.Factory;
import com.xubing.designpattern.factorymethod.framework.Product;
import com.xubing.designpattern.factorymethod.idcard.IDCardFactory;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 16:19
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product 小米 = factory.create("小米");
        Product 华为 = factory.create("华为");
        Product 魅族 = factory.create("魅族");

        小米.use();
        华为.use();
        魅族.use();
    }
}
