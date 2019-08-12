package leetcode;

import java.util.Arrays;

public class Q0977_SquaresofaSortedArray {

    public int[] sortedSquares(int[] A) {
        int[] a = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            a[i] = A[i] * A[i];
        }
        Arrays.sort(a);
        return a;
    }
}
