package designpattern;

import java.lang.reflect.Constructor;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 9:59
 * @description 单例模式饿汉式
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }
}

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 9:59
 * @description 单例模式懒汉式
 */
class SingletonLazy {
    private static SingletonLazy singleton;

    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance() {
        if (null != singleton) {
            singleton =  new SingletonLazy();
        }
        return singleton;
    }
}

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 9:59
 * @description 单例模式双重检查
 */
class SingletonDoublecheck {
    private static volatile SingletonDoublecheck singleton;

    private SingletonDoublecheck() {}

    public static  SingletonDoublecheck getInstance() {
        if (null == singleton) {
            synchronized (SingletonDoublecheck.class) {
                if (null == singleton) {
                    singleton = new SingletonDoublecheck();
                }
            }
        }
        return singleton;
    }
}
/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 9:59
 * @description 单例模式内部类
 */
class SingletonInnerHolder {

    private SingletonInnerHolder() {}

    private static class Holder {
        private static SingletonInnerHolder instance = new SingletonInnerHolder();
    }

    public static SingletonInnerHolder getInstance() {
        return Holder.instance;
    }
}
/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/30 9:59
 * @description 单例模式枚举
 */
enum SingletonEnum {
    INSTANCE
}

/**
 * 通过反射破坏单例
 */

class Main {
    public static void main(String[] args) throws Exception {
        Class<Singleton> singleton = Singleton.class;


        Constructor<Singleton> constructor = singleton.getDeclaredConstructor();

        constructor.setAccessible(true);

        Singleton instance1 = constructor.newInstance();
        Singleton instance2 = constructor.newInstance();


        System.out.println(instance1.equals(instance2));


        Class<SingletonDefendReflection> safeSingleton = SingletonDefendReflection.class;
        Constructor<SingletonDefendReflection> constructor1 = safeSingleton.getDeclaredConstructor();

        constructor1.setAccessible(true);


        SingletonDefendReflection instance4 = constructor1.newInstance();
        SingletonDefendReflection instance3 = constructor1.newInstance();

        System.out.println(instance3.equals(instance4));

    }
}

/**
 * 防止反射
 */

class SingletonDefendReflection {

    private static boolean flag = false;

    private static SingletonDefendReflection singleton = new SingletonDefendReflection();

    private SingletonDefendReflection() {
        synchronized (SingletonDefendReflection.class) {
            if (!flag) {
                flag = true;
            } else {
                throw new RuntimeException("小子你有点皮啊");
            }
        }
    }

    public static SingletonDefendReflection getInstance() {
        return singleton;
    }
}

