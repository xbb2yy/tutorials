package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0509_FibonacciNumber {

    public static int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        return fib(N - 2) + fib(N - 1);
    }

    public static int solution(int N) {

        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        int prev = 1;
        int prev2 = 0;
        for (int i = 2; i <= N; i++) {
            int tmp = prev;
            prev = prev + prev2;
            prev2 = tmp;
        }
        return prev;
    }

    public static void main(String[] args) {
        assert fib(11) == solution(11);
    }
}