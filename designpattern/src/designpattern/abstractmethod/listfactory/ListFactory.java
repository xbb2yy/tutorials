package designpattern.abstractmethod.listfactory;

import designpattern.abstractmethod.factory.Factory;
import designpattern.abstractmethod.factory.Link;
import designpattern.abstractmethod.factory.Page;
import designpattern.abstractmethod.factory.Tray;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 11:09
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String url, String caption) {
        return new ListLink(url, caption);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new  ListPage(title, author);
    }
}
