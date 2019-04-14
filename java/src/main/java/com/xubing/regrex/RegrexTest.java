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

    public static final String EXAMPLE_TEST = "This is my small example "
            + "strings which I'm going to" + "use for pattern matching.";


    @Test
    public void test() {
        String pattern = "(\\w)(\\s+)([\\.,])";
        System.out.println(EXAMPLE_TEST.replaceAll(pattern, "$1$3"));
    }

    @Test
    public void test1() {
        // Extract the text between the two title elements
        System.out.println(EXAMPLE_TEST);
        String pattern = "(?i)(<title.*?>)(.+?)()";
        String updated = EXAMPLE_TEST.replaceAll(pattern, "$2");
        System.out.println(updated);
    }


    @Test
    public void test2() {
        String str = "[www.javaxxz.com]]day01-python 全栈开发-基础篇";
        String regex = "^\\[.*?]";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(str);
        }
    }

    @Test
    public void test3() {
        String str = "aa<div>test1</div>bb<div>test2</div>cc";
        String greedy = "<div>.*</div>";
        String reluctant = "<div>.*?</div>";

        Pattern greedyPattern = Pattern.compile(greedy);
        Pattern reluctantPattern = Pattern.compile(reluctant);

        Matcher matcher = greedyPattern.matcher(str);
        Matcher reluctantMatcher = reluctantPattern.matcher(str);

        while (matcher.find()) {
            System.out.println("greedy" + matcher.group());
        }

        while (reluctantMatcher.find()) {
            System.out.println(reluctantMatcher.group());
        }
    }

    @Test
    public void testGroupAndBackRefrence() {
        String str = "abcdefg1gg23ihfg1gg";
        String regex = "(fg)(.)(gg)";
        Pattern pattern = Pattern.compile(regex);
        String s = str.replaceAll(regex, "$1$3");
        System.out.println(s);

    }

    /**
     * 手机号码正则
     */
    @Test
    public void phoneNumberTest() {

        String phone1 = "13221982223";
        String phone2 = "18221982223";
        String phone3 = "132219822232";
        String phone4 = "162219822232";
        String phone5 = "216221982223";
        String phone6 = "14221982223";

        String regex = "^1[356789]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);

        Assert.assertTrue(pattern.matcher(phone1).find());
        Assert.assertTrue(pattern.matcher(phone2).find());
        Assert.assertFalse(pattern.matcher(phone3).find());
        Assert.assertFalse(pattern.matcher(phone4).find());
        Assert.assertFalse(pattern.matcher(phone5).find());
        Assert.assertFalse(pattern.matcher(phone6).find());
    }

    @Test
    public void emailTest() {
        List<String> emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");


        emails.add("user#domain.com");
        emails.add("@yahoo.com");

        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }

    @Test
    public void testEmail() {
        List<String> emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user.name@domain.com");
        emails.add("user_name@domain.com");
        emails.add("username@yahoo.corporate.in");

//Invalid emails
        emails.add(".username@yahoo.com");
        emails.add("username@yahoo.com.");
        emails.add("username@yahoo..com");
        emails.add("username@yahoo.c");
        emails.add("username@yahoo.corporate");

        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }


}
