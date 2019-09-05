package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0069_Sqrt {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
<<<<<<< HEAD
            return x;
=======
            return 0;
>>>>>>> f031d0f6f49c153841f88885c65b0d20ad645871
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

    public static int solution(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1, end = x / 2 + 1;

        while (start < end) {
            int mid = start + (end - start + 1) / 2;

            if (x / mid < mid) {
                end = mid - 1;
            } else {
                start = mid;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(solution(8));
    }
}
