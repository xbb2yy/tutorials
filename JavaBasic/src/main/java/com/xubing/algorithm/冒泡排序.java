package com.xubing.algorithm;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 15:19
 */
public class 冒泡排序 {

    public static void main(String[] args) {
        int[] a = {32, 78, 22, 45, 2, 44, 66,3241, 23, 876, 23};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 ; j++) {
                if(a[j] > a[j+1]) {
                    int tmp;
                    tmp = a[j];
                    a[j] = a[j +1];
                    a[j+1] = tmp;
                }
            }
        }
        return a;
    }
}
