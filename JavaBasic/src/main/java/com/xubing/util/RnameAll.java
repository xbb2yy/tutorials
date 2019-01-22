package com.xubing.util;

import java.io.File;
import java.util.Arrays;

/**
 * @author xubing xbbjava@163.com
 * @className RnameAll
 * @description TODO
 * @date 2018/5/11 17:11
 */
public class RnameAll {

    /**
     * 删除某个文件夹下所有文件名中的特定字符
     *
     * @return
     */
    public static boolean reName(File file, String regex) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            Arrays.stream(files).forEach(f -> {
                if (f.isDirectory()) {
                    f.renameTo(new File(f.getParent() + "\\" + f.getName().replaceAll(regex, "")));
                    reName(f, regex);
                } else {
                    f.renameTo(new File(f.getParent() + "\\" + f.getName().replaceAll(regex, "")));
                }
            });
        }
        return false;
    }

    public static void main(String[] args) {

        reName(new File("F:\\[后端开发]Spring Security开发AQ的REST服务"), "IT教程吧【www\\.itjc8\\.com】");
    }

}
