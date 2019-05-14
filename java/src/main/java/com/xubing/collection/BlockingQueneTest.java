package com.xubing.collection;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author xubing xbbjava@163.com
 * @description TODO
 * @date 2018/6/7 10:25
 */
public class BlockingQueneTest {

    @Test
    public void test() throws InterruptedException {
        ArrayBlockingQueue<String> quene = new ArrayBlockingQueue<>(10);
        for (int i = 0; i < 10; i++) {
            // add为非阻塞的方法，队列满了抛异常
            quene.add(String.valueOf(i));
        }

        // elemtent 检查元素
        String element = quene.element();
        System.out.println(element);

        // offer 方法返回boolean
        boolean offer = quene.offer("11");
        System.out.println(offer);

        // 队列不存在元素， remove抛出异常
        String remove = quene.remove();
        System.out.println(remove);

        String take = quene.take();
        System.out.println(take);

        String poll = quene.poll();
        System.out.println(poll);



    }
}
