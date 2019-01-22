package com.xubing.designpattern.factorymethod.idcard;

import com.xubing.designpattern.factorymethod.framework.Product;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 16:10
 */
public class IDCard extends Product {
    private String owner;

    IDCard (String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
