package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0070_ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int m = 1;
        int k = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = k;
            k = m + k;
            m = tmp;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(34));
    }
}
