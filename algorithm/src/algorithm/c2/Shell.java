package algorithm.c2;

import static algorithm.c2.Example.*;

/**
 * 希尔排序
 */
public class Shell {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            h = h / 3;
        }

    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[j] = a[i];
        a[i] = t;
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void main(String[] args) {
        String[] a = {"qadf", "fdafas", "erqwr", "ffdsaf", "dfsaf", "dfsaf", "trwetew", "oqwrew"};
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
