package com.xubing.regrex;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xubing xbbjava@163.com
 * @className RegrexTest
 * @description 正则表达式学习
 * @date 2018/5/9 10:39
 */
public class RegrexTest {

    @Test
    public void test() {
        String str = "aaa123babaa2343a";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
    }

    @Test
    public void test1() {

    }
}
