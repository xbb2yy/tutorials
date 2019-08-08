package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转阿拉伯数字
 * 思路:
 * 用map保存映射，然后从左往右每次读入一个字符，如果该字符保存的映射值比它右边的小就减去改字符的映射，否则加上该字符的映射
 * i + 1 < chars.length && map.get(chars[i]) < map.get(chars[i + 1])
 */
@Pass
public class Q0013_RomantoInteger {

    public int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && map.get(chars[i]) < map.get(chars[i + 1])) {
                sum -= map.get(chars[i]);
            } else {
                sum += map.get(chars[i]);
            }
        }
        return sum;
    }
}
