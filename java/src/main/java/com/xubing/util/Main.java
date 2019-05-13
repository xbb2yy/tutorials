package com.xubing.util;

import com.beust.jcommander.internal.Lists;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author xubing xbbjava@163.com
 * @className Main
 * @description TODO
 * @date 2018/5/28 18:55
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<String> dateStrList = Lists.newArrayList(
                "2018-04-01 10:00:01",
                "2018-04-02 11:00:02",
                "2018-04-03 12:00:03",
                "2018-04-04 13:00:04",
                "2018-04-05 14:00:05"
        );
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for (String str : dateStrList) {
            executorService.execute(() -> {
                try {
                    simpleDateFormat.parse(str);
                    TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }


    }
}
