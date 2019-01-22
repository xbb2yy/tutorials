package com.xubing.designpattern.abstractmethod.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 10:26
 */
public abstract class Tray extends Item {
    protected List<Item> list = new ArrayList<>();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        list.add(item);
    }
}
