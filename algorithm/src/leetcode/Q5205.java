package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q5205 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.compute(arr[i], (k, v) -> v == null ? 1: v + 1);
        }
        if (new HashSet(map.values()).size() == map.keySet().size()) {
            return true;
        }
        return false;
    }
}
