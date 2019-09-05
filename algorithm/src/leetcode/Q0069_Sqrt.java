package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0069_Sqrt {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return 0;
        }

        int ans = x / 2;
        while (true) {
            if (x / ans > ans) {
                break;
            }
            ans = ans / 2;
        }
        for (int i = ans; i <= 2 * ans + 1; i++) {
            if (i * i == x) {
                return i;
            }
            if (x / i < i) { // 除法解决溢出问题
                return  i - 1;
            }
        }

        return  -1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
