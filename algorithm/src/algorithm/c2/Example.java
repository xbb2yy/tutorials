package algorithm.c2;

import edu.princeton.cs.algs4.StdOut;

public abstract class Example {

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[j] = a[i];
        a[i] = t;
    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }
}
