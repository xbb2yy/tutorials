package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0832_FlippinganImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int l = A[i].length;

            if (l % 2 == 1) {
                A[i][l/2] = A[i][l/2]^1;
            }
            for (int j = 0; j < l / 2; j++) {
                int tmp = A[i][j];
                int tmp1 = A[i][l - 1 -j];

                 A[i][j] = tmp1^1;
                 A[i][l - 1 - j] = tmp^1;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        System.out.println(0^1);
    }
}
