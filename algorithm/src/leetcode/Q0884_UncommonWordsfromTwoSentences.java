package leetcode;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
 *
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 *
 * Return a list of all uncommon words.
 *
 * You may return the list in any order.
 */
@Pass
public class Q0884_UncommonWordsfromTwoSentences {

    public String[] uncommonFromSentences(String A, String B) {

        ArrayList<String> a = new ArrayList<>(Arrays.asList(A.split(" ")));
        a.addAll(Arrays.asList(B.split(" ")));

        Map<String, Integer> map = new ConcurrentHashMap<>();

        a.parallelStream().forEach(s -> {
            if (map.containsKey(s)) {
                Integer integer = map.get(s);
                map.put(s, integer + 1);
            } else {
                map.put(s, 1);
            }
        });


        List<String> collect = map.keySet().parallelStream().filter(k -> map.get(k) == 1).collect(Collectors.toList());

        String[] strings = new String[collect.size()];
        return collect.toArray(strings);
    }
}
