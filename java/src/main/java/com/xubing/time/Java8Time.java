package com.xubing.time;

import org.junit.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.*;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/23 10:25
 */
public class Java8Time {


    @Test
    public void test1() {

        Instant now = Instant.now();
        Instant instant = Instant.ofEpochMilli(1000);
        boolean after = now.isAfter(instant);

        System.out.println(after);

    }

    @Test
    public void test2() {
        LocalDate now = LocalDate.now();
        System.out.println(now);


        LocalDate plus = now.plus(1, ChronoUnit.YEARS);

        LocalDate programmerDay = LocalDate.of(2017, 1, 1).plusDays(255);
        System.out.println(programmerDay);

        DayOfWeek dayOfWeek = programmerDay.getDayOfWeek();
        System.out.println(dayOfWeek);

        System.out.println(1 + 2 + 3);
    }

    @Test
    public void test3() {
        String s = "1,2,,3,4,,,";
        String[] split = s.split(",");
        System.out.println(split.length);
        for (String c : split) {
            System.out.println(c);
        }
    }

    @Test
    public void test4() {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
    }

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(4, 4, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1));

        Future<Double> future = poolExecutor.submit(() ->
                1.0d);

        try {
            Double num = future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

}
