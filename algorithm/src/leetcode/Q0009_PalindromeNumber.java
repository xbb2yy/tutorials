package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0009_PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        StringBuilder builder = new StringBuilder(String.valueOf(x));
        return (builder.toString().equals(builder.reverse().toString()));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
