package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;

@Pass
public class Q0048_RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n -1 - j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[5][2];
        System.out.println(Arrays.toString(a));
    }
}
