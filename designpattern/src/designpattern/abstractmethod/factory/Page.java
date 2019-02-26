package designpattern.abstractmethod.factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 10:31
 */
public abstract class Page {

    protected String title;
    protected String author;
    protected ArrayList<Item> cotent = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        cotent.add(item);
    }

    public void output() {
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHtml());
            writer.close();

            System.out.println(fileName + "编写完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();
}
