package com.xubing.designpattern.abstractmethod.listfactory;

import com.xubing.designpattern.abstractmethod.factory.Item;
import com.xubing.designpattern.abstractmethod.factory.Tray;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 11:18
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption + "\n");
        builder.append("<ul>\n");

        for (Item item : list) {
            builder.append(item.makeHtml());
        }

        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
