package com.xubing.aspect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/23 14:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AspectConfig.class})
public class Main {

    @Autowired
    private Person person;


    @Test
    public void test() {
        person.say();
    }


}
