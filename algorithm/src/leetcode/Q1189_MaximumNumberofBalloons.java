package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q1189_MaximumNumberofBalloons {

    public int maxNumberOfBalloons(String text) {

        // balloon
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            map.compute(chars[i], (k, v) -> {
                if (v == null) {
                    return 1;
                }
                return v + 1;
            });
        }

        int min = 10000;
        if (!map.containsKey('b') || !map.containsKey('a') || !map.containsKey('l') || !map.containsKey('o') || !map.containsKey('n')) {
            return 0;
        }
        if ( map.get('b') < min) {
            min = map.get('b');
        }
        if (map.get('a') < min) {
            min = map.get('a');
        }
        if (map.get('l') / 2< min) {
            min = map.get('l') / 2;
        }
        if (map.get('o') / 2< min) {
            min = map.get('o') / 2;
        }
        if (map.get('n') < min) {
            min = map.get('n');
        }
        return min;
    }
}
