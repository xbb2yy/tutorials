package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0326_PowerofThree {

    public static boolean isPowerOfThree(int n) {
        if(n==1||n==0){return n==1;}
        return (n%3==0)&&(isPowerOfThree(n/3));

    }

    public boolean solution(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {

    }

}
