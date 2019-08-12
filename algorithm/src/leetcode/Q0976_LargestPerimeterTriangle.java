package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;

@Pass
public class Q0976_LargestPerimeterTriangle {

    public static int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1 ; i--) {
            for (int j = i - 2; j >= 0 ; j--) {
                if (A[i - 1] + A[j] > A[i]) {
                    return A[i - 1] + A[j] + A[i];
                }
                break;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 2};
        System.out.println(largestPerimeter(a));
    }
}
