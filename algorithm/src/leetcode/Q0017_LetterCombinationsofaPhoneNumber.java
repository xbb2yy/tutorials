package leetcode;

import java.util.*;

public class Q0017_LetterCombinationsofaPhoneNumber {

    private static Map<Character, List<Character>> map = new HashMap<>();
    static {
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
        map.put('4', Arrays.asList('g', 'h', 'i'));
        map.put('5', Arrays.asList('j', 'k', 'l'));
        map.put('6', Arrays.asList('m', 'n', 'o'));
        map.put('7', Arrays.asList('p', 'q', 'r', 's'));
        map.put('8', Arrays.asList('v', 't', 'u'));
        map.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    public static List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();
        if (null == digits || digits.length() == 0) {
            return list;
        }
        List<Character> l = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            l.add(c);
        }
        letterCombinations(l, "", list, 0);
        return list;
    }

    public static void letterCombinations(List<Character> c, String s, List<String> list, int j) {
        if (c.size() == j) {
            list.add(s);
            return;
        }
        List<Character> characters = map.get(c.get(j));
        for (Character cc : characters) {
            letterCombinations(c, s + cc, list, j + 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
