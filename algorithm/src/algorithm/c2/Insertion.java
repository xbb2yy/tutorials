package algorithm.c2;

import java.util.Arrays;

import static algorithm.c2.Example.exch;

/**
 * 插入排序
 */
public class Insertion {

    public static void sort(Comparable[] a) {
        int N = a.length;

        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && a[j].compareTo(a[j - 1]) < 0 ; j--) {
                exch(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] a = {"adf", "fdafas", "erqwr", "ffdsaf", "dfsaf"};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
