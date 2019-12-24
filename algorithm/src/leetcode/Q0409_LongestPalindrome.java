package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.Map;
@Pass
public class Q0409_LongestPalindrome {

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.compute(s.charAt(i), (k, old) -> old == null ? 1 : old + 1);
        }
        long count = map.values().stream().filter(value -> value % 2 != 0).count();
        if (count == 0) return s.length();
        return (int) (s.length() - count + 1);
    }

    public int solution(String s) {
        boolean[] a = new boolean[54];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 65] = !a[s.charAt(i) - 65];
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]) count++;
        }
        if (count == 0) return s.length();
        return (int) (s.length() - count + 1);
    }

    public static void main(String[] args) {
        System.out.println('a' - 65);
    }
}
