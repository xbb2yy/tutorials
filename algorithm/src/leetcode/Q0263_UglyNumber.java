package leetcode;

public class Q0263_UglyNumber {

    public boolean isUgly(int num) {
        if (num == 1) {
            return true;
        }
        if (num == 0) {
            return false;
        }
        if (num % 2 == 0) {
            return isUgly(num / 2);
        }
        if (num % 3 == 0) {
            return isUgly(num / 3);
        }
        if (num % 5 == 0) {
            return isUgly(num / 5);
        }
        return false;
    }

    /**
     * 非递归速度更快
     * @param num
     * @return
     */
    public boolean solution(int num) {
        if (num <= 0) {
            return false;
        }
        int n = num;
        while (true) {
            int t = n;
            if (num == 1) {
                return true;
            }
            if (num % 2 == 0) {
                n = n / 2;
            }
            if (num % 3 == 0) {
                n = n / 3;
            }
            if (num % 5 == 0) {
                n = n / 5;
            }
            if (t == n) {
                return false;
            }
        }
    }
}
