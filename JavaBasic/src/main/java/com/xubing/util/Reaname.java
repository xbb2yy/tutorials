package com.xubing.util;

import java.io.File;
import java.util.Arrays;

/**
 * @author xubing xbbjava@163.com
 * @className Reaname
 * @description TODO
 * @date 2018/5/10 14:43
 */
public class Reaname {

    public static void main(String[] args) {
        File file = new File("F:\\【No0139】2017年老男孩最新全栈python第2期视频教程 全套完整版");

        Arrays.stream(file.listFiles()).forEach(x -> {
            String origin = x.getName();
            System.out.println(origin);
            x.renameTo(new File("F:\\【No0139】2017年老男孩最新全栈python第2期视频教程 全套完整版\\" + origin.substring(17)));
        });
    }
}
