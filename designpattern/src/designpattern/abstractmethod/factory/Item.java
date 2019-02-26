package designpattern.abstractmethod.factory;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 10:23
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHtml();
}
