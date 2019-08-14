package leetcode;

import java.util.HashSet;
import java.util.Set;

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
}
