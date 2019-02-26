package designpattern.abstractmethod.listfactory;

import designpattern.abstractmethod.factory.Link;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 11:10
 */
public class ListLink extends Link {

    public ListLink(String url, String caption) {
        super(url, caption);
    }

    @Override
    public String makeHtml() {
        return "<li> <a href = \"" + url + "\">" + caption +  "</a></li>\n";
    }
}
