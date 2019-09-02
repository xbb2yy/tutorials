package leetcode;

import leetcode.common.Pass;

import java.util.*;

@Pass
public class Q0003_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        int max = 0;
        for (int i = 0; i < c.length - max; i++) {
            Set<Character> characters = new HashSet<>();
            for (int j = i; j < c.length; j++) {
                if (!characters.add(c[j])) {
                    break;
                } else {
                    characters.add(c[j]);
                }
            }

            if (max < characters.size())
                max = characters.size();
        }
        return max;
    }


    public static int solution(String s) {

        int max = 0;
        int cur = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Integer, Character> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (cur > max) {
                    max = cur;
                }
                Integer index = map.get(s.charAt(i));
                cur = i - index;

                map.clear();
                m.put(i, s.charAt(i));
                for (int j = index + 1; j <= i; j++) {
                    map.put(m.get(j), j);
                }
            } else {
                map.put(s.charAt(i), i);
                m.put(i, s.charAt(i));
                cur++;
            }
        }
        return cur > max ? cur : max;
    }

    public static int solution1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                start = Math.max(map.get(s.charAt(i)), start);
            }
            ans = Math.max(ans, i - start + 1);
            map.put(s.charAt(i), i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        solution1("bc12cdefak2j");
    }
}
