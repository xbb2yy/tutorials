package leetcode;

import leetcode.common.Pass;

import java.util.*;

@Pass
public class Q500_KeyboardRow {

    private static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('q', 1);
        map.put('a', 2);
        map.put('z', 3);
        map.put('w', 1);
        map.put('s', 2);
        map.put('x', 3);
        map.put('e', 1);
        map.put('d', 2);
        map.put('c', 3);
        map.put('r', 1);
        map.put('f', 2);
        map.put('v', 3);
        map.put('t', 1);
        map.put('g', 2);
        map.put('b', 3);
        map.put('y', 1);
        map.put('h', 2);
        map.put('n', 3);
        map.put('u', 1);
        map.put('j', 2);
        map.put('m', 3);
        map.put('i', 1);
        map.put('k', 2);
        map.put('o', 1);
        map.put('l', 2);
        map.put('p', 1);
    }


    public static String[] findWords(String[] words) {


        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            Set<Integer> s = new HashSet<>();
            for (int j = 0; j < words[i].length(); j++) {
                if (Character.isUpperCase(words[i].charAt(j))) {
                    char c = Character.toLowerCase(words[i].charAt(j));
                    s.add(map.get(c));
                } else {
                    s.add(map.get(words[i].charAt(j)));
                }
            }
            if (s.size() == 1) {
                list.add(words[i]);
            }

        }

        return list.toArray(new String[list.size()]);
    }


    public static void main(String[] args) {

    }
}
