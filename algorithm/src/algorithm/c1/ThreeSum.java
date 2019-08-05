package algorithm.c1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class ThreeSum {

    public static int count(int[] a) {
        int N = a.length;

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (a[i] + a[k] + a[j] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * https://algs4.cs.princeton.edu/14analysis/1Kints.txt
     * https://algs4.cs.princeton.edu/14analysis/2Kints.txt
     * https://algs4.cs.princeton.edu/14analysis/4Kints.txt
     * https://algs4.cs.princeton.edu/14analysis/8Kints.txt
     * https://algs4.cs.princeton.edu/14analysis/16Kints.txt
     * https://algs4.cs.princeton.edu/14analysis/32Kints.txt
     * https://algs4.cs.princeton.edu/14analysis/1Mints.txt
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = new In(args[0]).readAllInts();
       StdOut.println(count(ints));
    }
}
