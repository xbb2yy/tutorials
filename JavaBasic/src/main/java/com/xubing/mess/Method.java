package com.xubing.mess;

/**
 * @author xubing xbbjava@163.com
 * @date 2018/6/19 16:03
 */
public class Method extends TimeSpend {
    public static final long INT = 100000;

    @Override
    protected void method() {
        double sum = getSum();
        for (long i = 1; i < INT; i++) {
            sum = (sum + 0.2) / i * 0.123;
        }
        System.out.println(sum);
    }

    private int getSum() {
        return 0;
    }

    public static void main(String[] args) {
        new Method().timeSpend();

    }
}
