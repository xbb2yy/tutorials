package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0073_SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][i] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (rows.contains(i)) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
            for (Integer col : cols) {
                matrix[i][col] = 0;
            }
        }
    }
}
