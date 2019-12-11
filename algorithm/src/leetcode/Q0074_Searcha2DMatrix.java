package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0074_Searcha2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean solution(int[][] matrix, int target) {

        int low = 0;
        int hi = matrix.length * matrix[0].length - 1;

        while (low < hi) {
            int mid = low + (hi - low) / 2;
            int m = mid / matrix.length;
            int n = mid - (m * matrix[0].length) ;
            if (matrix[m][n] == target) return true;
            if (matrix[m][n] < target) low = mid + 1;
            if (matrix[m][n] > target) hi = mid - 1;
        }
        return false;
    }
}
