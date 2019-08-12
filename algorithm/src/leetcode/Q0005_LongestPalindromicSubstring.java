package leetcode;

import leetcode.common.Pass;

/**
 * 找出字符串中最大的回文串
 */
@Pass
public class Q0005_LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {

        if (s.isEmpty()) {
            return "";
        }
        int N = s.length();
        int start = 0;
        int end = 0;
        int max = 1;
        for (int i = 0; i < N; i++) {
            int k = 1;
            int l = 0;
            for (int j = 1; i - j >= 0 && i + j < N; j++) {
                if (s.charAt(i - j) == s.charAt(i + j)) {
                    k += 2;
                } else {
                    break;
                }
            }

            for (int j = 1; i - j + 1>= 0 && i + j < N; j++) {
                if (s.charAt(i - j + 1) == s.charAt(i + j)) {
                    l += 2;
                } else {
                    break;
                }
            }

            if (k > l && k > max) {
                max = k;
                start = i - (k - 1) / 2;
                end = i + (k - 1) / 2 ;
            }
            if (l > k && l > max) {
                max = l;
                start = i - l / 2 + 1;
                end = i + l  / 2;
            }
        }
        if (start != 0 || end != 0) {
            return s.substring(start, end + 1);
        }
        return s.substring(0, 1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaa"));
    }
}
