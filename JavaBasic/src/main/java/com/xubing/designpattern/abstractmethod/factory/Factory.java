package com.xubing.designpattern.abstractmethod.factory;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 10:46
 */
public abstract class Factory {

    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String url, String caption);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);

}
