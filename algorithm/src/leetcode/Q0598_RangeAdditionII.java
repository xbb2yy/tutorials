package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0598_RangeAdditionII {

    public static int maxCount(int m, int n, int[][] ops) {

        // 需要考虑特殊情况
        if (ops.length == 0) {
            return m * n;
        }

        int k =40000, l =40000;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i][0] < k) {
                k = ops[i][0];
            }
            if (ops[i][1] < l) {
                l = ops[i][1];
            }

        }

        return k * l;
    }

    public static void main(String[] args) {
        int [] [] a = {{2, 2}, {3, 3}};
        maxCount(1, 2, a);
    }
}
