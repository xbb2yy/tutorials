package com.xubing.mess;

import java.time.Instant;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/19 15:58
 */
public abstract class TimeSpend {

    public void timeSpend() {
        long start = Instant.now().toEpochMilli();
        method();
        long end = Instant.now().toEpochMilli();
        System.out.println("method cost:" + (end - start) + "mills");
    }

    protected abstract void method();
}
