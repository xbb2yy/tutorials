package leetcode;

public class Q0342_PowerofFour {

    public boolean isPowerOfFour(int num) {
        if (num == 0) {
            return false;
        }
        int n = num;
        while (n != 1) {
            if (n % 4 != 0) {
                return false;
            }
            n = n >> 2;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(4 >> 2);
    }
}
