package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0509_FibonacciNumber {

    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }

        return fib(N - 2) + fib(N - 1);
    }
}