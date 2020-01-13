package leetcode;

import java.util.Arrays;
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

    public static int[] solution(int[] numbers, int target) {

        int[] a = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int i1 = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if (i1 >= 0) {
                a[0] = i + 1;
                a[1] = i1 + 1;
                break;
            }
        }
        return a;
    }

    public int[] solution2(int[] numbers, int target) {
        int[] ans = new int[2];
        int first = 0, sec = numbers.length - 1;
        while (first < sec) {
            if (numbers[first] + numbers[sec] == target) {
                ans[0] = first + 1;
                ans[1] = sec + 1;
                return ans;
            }
            if (numbers[first] + numbers[sec] < target) {
                first++;
                continue;
            }
            if (numbers[first] + numbers[sec] > target) {
                sec--;
            }
        }
        return ans;
    }
}
