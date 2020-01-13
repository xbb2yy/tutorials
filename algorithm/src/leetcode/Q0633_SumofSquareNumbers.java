package leetcode;

public class Q0633_SumofSquareNumbers {

    public static boolean judgeSquareSum(int c) {
        int start = 0, end = (int) Math.sqrt(c);;
        while (start <= c) {
            int ans = start * start + end * end;
            if (c == ans) {
                return true;
            }
            if (c < ans) {
                end--;
            }
            if (c > ans) {
                start++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(999999999));
    }
}
