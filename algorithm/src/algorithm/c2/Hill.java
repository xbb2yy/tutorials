package algorithm.c2;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class Hill {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && a[j].compareTo(a[j - h]) < 0; j -= h) {
                    Comparable t = a[j];
                    a[j] = a[j - h];
                    a[j - h] = t;
                }
            }
            h = h / 3;
        }

    }

    public static void main(String[] args) {
        String[] a = {"qadf", "fdafas", "erqwr", "ffdsaf", "dfsaf", "dfsaf", "trwetew", "oqwrew"};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
