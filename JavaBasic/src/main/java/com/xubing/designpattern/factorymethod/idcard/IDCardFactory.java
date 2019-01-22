package com.xubing.designpattern.factorymethod.idcard;

import com.xubing.designpattern.factorymethod.framework.Factory;
import com.xubing.designpattern.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 16:13
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
