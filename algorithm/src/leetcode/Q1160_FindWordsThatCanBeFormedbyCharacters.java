package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计每个字符的总数，然后循环判断比较
 */
@Pass
public class Q1160_FindWordsThatCanBeFormedbyCharacters {

    public int countCharacters(String[] words, String chars) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            map.compute(chars.charAt(i), (k, v) -> v == null ? 1 : v + 1);
        }
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            Map<Character, Integer> m = new HashMap<>();
            for (int j = 0; j < words[i].length(); j++) {
                m.compute(words[i].charAt(j), (k, v) -> v == null ? 1 : v + 1);
            }

            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : m.entrySet()) {
                if (map.containsKey(entry.getKey()) && map.get(entry.getKey()) >= entry.getValue()) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += words[i].length();
            }
        }
        return sum;
    }


    public static void main(String[] args) {

    }
}
