package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Q0049_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            map.compute(new String(chars), (k, o) -> {
                if (o == null) {
                    o = new ArrayList<>();
                }
                o.add(str);
                return o;
            });
        }

        return map.values().stream().collect(Collectors.toList());
    }
}
