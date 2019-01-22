package com.xubing.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author xubing xbbjava@163.com
 * @className Apple
 * @description
 * @date 2018/6/7 17:29
 */
public class Apple extends Fruit {

    public static void main(String[] args) throws Exception{
        Fruit apple = new Apple();
        ((Apple) apple).fruit(apple);


        FileInputStream in = new FileInputStream("D:\\workspace\\java\\JavaBasicKnowledge\\src\\main\\resources\\Vultr docker安装mysql.md");
        FileOutputStream out = new FileOutputStream("D:\\workspace\\java\\JavaBasicKnowledge\\src\\main\\resources\\test.md");
        byte[] buffer = new byte[20 * 1024];

        // read() 最多读取 buffer.length 个字节
        // 返回的是实际读取的个数
        // 返回 -1 的时候表示读到 eof，即文件尾
        while (in.read(buffer, 0, buffer.length) != -1) {
            out.write(buffer);
        }

        in.close();
        out.close();
        System.out.println(1);

    }

    public void fruit(Fruit fruit) {
        System.out.println("fruit");
    }

    public void fruit(Apple apple) {
        System.out.println("apple");
    }
}
