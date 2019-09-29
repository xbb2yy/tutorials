package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q5207 {


    public static int equalSubstring(String s, String t, int maxCost) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(i, Math.abs((t.charAt(i) - s.charAt(i))));
        }
        int start = 0;
        int cost = 0;
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < map.size(); i++) {
            cost += map.get(i);
            if (cost <= maxCost) {
                tmp++;
                continue;
            } else {
                if (tmp > max) {
                    max = tmp;
                }
                cost -= map.get(start);
                start++;
            }
        }
        return  tmp > max ? tmp: max;
    }

    public static void main(String[] args) {
        /**
         * "krpgjbjjznpzdfy"
         * "nxargkbydxmsgby"
         * 14
         */
        System.out.println(equalSubstring("krpgjbjjznpzdfy", "nxargkbydxmsgby", 14));
    }
}
