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
}
