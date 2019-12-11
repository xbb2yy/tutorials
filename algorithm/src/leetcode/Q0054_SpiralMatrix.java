package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q0054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int l =0, r = matrix[0].length, u = 0, b = matrix.length;
        int flag = 1;
        while (true) {
            if (flag == 1) {
                for (int i = 0; i < matrix[l].length; i++) {
                    list.add(matrix[l][i]);
                    u++;
                    flag = 2;
                }
            }
            if (flag == 2) {

            }
        }
    }
}
