package leetcode;

public class Q0231_PowerofTwo {

    public boolean isPowerOfTwo(int n) {

        if (n == 1) {
            return true;
        }
        int s = 1;
        while (s < n) {
            s = s * 2;
        }

        if (s == n) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(3>>2);
    }
}
