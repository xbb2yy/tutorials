package com.xubing.designpattern.abstractmethod.factory;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 10:24
 */
public abstract class Link extends Item {
    protected String url;
    public Link(String url, String caption) {
        super(caption);
        this.url = url;
    }
}
