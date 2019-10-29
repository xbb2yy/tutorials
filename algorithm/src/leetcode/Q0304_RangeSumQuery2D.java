package leetcode;

import java.util.concurrent.ForkJoinPool;

public class Q0304_RangeSumQuery2D {

    private  int[][] a;
    public Q0304_RangeSumQuery2D(int[][] matrix) {
        a = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }
}
