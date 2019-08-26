package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q0167_TwoSumII {

    public int[] twoSum(int[] numbers, int target) {

        int[] a = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                a[0] = map.get(target - numbers[i]) + 1;
                a[1] = i + 1;
                break;
            } else {
                map.put(numbers[i], i);
            }
        }
        return a;
    }
}
