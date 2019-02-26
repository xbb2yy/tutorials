package com.xubing.construtor;

/**
 * @author xubing xbbjava@163.com
 * @className SubConstructor
 * @description TODO
 * @date 2018/5/11 9:58
 */
public class SubConstructor extends PrivateConstructor {

    public SubConstructor() {
        // 当父类的无参构造器为private，子类需要显示调用父类非private的有参构造器
        super(null);
    }
}
