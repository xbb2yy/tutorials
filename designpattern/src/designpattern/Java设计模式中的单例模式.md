## 什么是单例模式
单例模式

* 饿汉式
```
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }
}
```

* 双重锁检查 DCL
```
class SingletonDoublecheck {
    private static volatile SingletonDoublecheck singleton;

    private SingletonDoublecheck() {}

    public static  SingletonDoublecheck getInstance() {
        if (null != singleton) {
            synchronized (SingletonDoublecheck.class) {
                if (null != singleton) {
                    singleton = new SingletonDoublecheck();
                }
            }
        }
        return singleton;
    }
}
```

* 枚举

```
enum SingletonEnum {
    INSTANCE
}

```

* 内部类

```
class SingletonInnerHolder {

    private SingletonInnerHolder() {}

    private static class Holder {
        private static SingletonInnerHolder instance = new SingletonInnerHolder();
    }

    public static SingletonInnerHolder getInstance() {
        return Holder.instance;
    }
}

```

* 单例模式懒汉式 sychronized 修饰方法

```
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
```


