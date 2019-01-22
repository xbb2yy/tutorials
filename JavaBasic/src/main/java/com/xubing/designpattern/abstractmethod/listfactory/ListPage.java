package com.xubing.designpattern.abstractmethod.listfactory;

import com.xubing.designpattern.abstractmethod.factory.Item;
import com.xubing.designpattern.abstractmethod.factory.Page;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 11:26
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>" + title + "</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h1>" + title + "</h1>\n");
        builder.append("<ul>\n");
        for (Item item : cotent) {
            builder.append(item.makeHtml());
        }
        builder.append("</ul>\n");
        builder.append("<hr><address>" + author + "</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
