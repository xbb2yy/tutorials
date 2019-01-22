package com.xubing.hongbao;

import org.junit.Test;

import java.util.*;

/**
 * @author xubing xbbjava@163.com
 * @className test
 * @description TODO
 * @date 2018/5/10 11:43
 */
public class test {


    public Collection<Double> hongbao(double total, int num) {

        Map<Integer, Double> map = new HashMap<>(16);

        Random random = new Random();
        double base = total / num;

        for (int i = 0; i < num; i++) {
            map.put(i, base);
        }
        for (int i = 0; i < num; i++) {
            double minus = random.nextDouble() * base;
            map.put(i, map.get(i) - minus);

            int toAdd = random.nextInt(num);
            map.put(toAdd, map.get(toAdd) + minus);
        }
        return map.values();
    }

    @Test
    public void test() {

        long start = System.nanoTime();
        Collection<Double> hongbao = hongbao(1043241, 9);

        double sum = 0;
        for (Double a : hongbao) {
            sum += a;
        }
        System.out.println(sum);
        System.out.println(System.nanoTime() - start);
        hongbao.forEach(System.out::println);
    }
}
