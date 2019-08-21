package leetcode;

public class Q0371_SumofTwoIntegers {

    public int getSum(int a, int b) {
        while (b != 0) {
            int c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(4 ^ 9);
    }
}
