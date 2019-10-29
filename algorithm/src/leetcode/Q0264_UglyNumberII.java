package leetcode;

public class Q0264_UglyNumberII {

    public int nthUglyNumber(int n) {
        if (n == 1) {
            return 1;
        }
        for (int i = 2, count = 1; count < n; i++) {
            if (isUgly(i)) {
                count++;
            }
            if (count == n) {
                return i;
            }
        }
        return -1;
    }

    public boolean isUgly(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            return isUgly(n / 2);
        }
        if (n % 3 == 0) {
            return isUgly(n / 3);
        }
        if (n % 5 == 0) {
            return isUgly(n / 5);
        }
        return false;
    }
}
