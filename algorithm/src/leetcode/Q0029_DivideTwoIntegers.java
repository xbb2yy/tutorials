package leetcode;

public class Q0029_DivideTwoIntegers {

    public int divide(int dividend, int divisor) {

        int ans = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            ans++;
        }

        return ans;
    }
}
