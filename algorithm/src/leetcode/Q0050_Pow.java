package leetcode;

public class Q0050_Pow {

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;

        for (long i = 1; i <= N;) {
            if (i == 1) {
                ans = ans * x;
                i++;
                continue;
            }
            if (2 * (i - 1) <= N) {
                ans = ans * ans;
                i = 2 * (i - 1) + 1;
            } else {
                ans = ans * x;
                i ++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
    }
}
