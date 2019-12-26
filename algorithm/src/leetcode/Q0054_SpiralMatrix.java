package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> ans = new ArrayList<>();
       if (matrix.length == 0) return ans;
       int row = matrix.length;
       int col = matrix[0].length;

       int[] rDirection = {0, 1, 0, -1};
       int[] cDirection = {1, 0, -1, 0};
       int direction = 0, r = 0, c = 0;
       boolean[][] seen = new boolean[row][col];

        for (int i = 0; i < row * col; i++) {
            ans.add(matrix[r][c]);
            seen[r][c] = true;
            int rNext = r + rDirection[direction];
            int cNext = c + cDirection[direction];
            if (rNext >= 0 && rNext < row && cNext >= 0 && cNext < col && !seen[rNext][cNext]) {
                r = rNext;
                c = cNext;
            } else {
                direction = (direction + 1) % 4;
                r = r + rDirection[direction];
                c = c + cDirection[direction];
            }
        }
        return ans;
    }
}
