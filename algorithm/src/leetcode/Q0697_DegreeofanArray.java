package leetcode;

import leetcode.common.Pass;

import java.util.*;

@Pass
public class Q0697_DegreeofanArray {


    public static int findShortestSubArray(int[] nums) {


        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> m = new HashMap<>();
        Set<Integer> set = new TreeSet<>();

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (k, v) -> {
                if (v == null) {
                    return 1;
                }
                return v + 1;
            });

            if (m.containsKey(nums[i])) {
                List<Integer> integers = m.get(nums[i]);
                integers.add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                m.put(nums[i], list);
            }

            if (map.get(nums[i]) > max) {
                set.clear();
                set.add(nums[i]);
                max = map.get(nums[i]);
            }

            if (map.get(nums[i]) == max) {
                set.add(nums[i]);
            }
        }

        int n = 50000;
        for (Integer integer : set) {
            List<Integer> list = m.get(integer);
            if (list.get(list.size() - 1) - list.get(0) + 1 < n) {
                n = list.get(list.size() - 1) - list.get(0) + 1;
            }
        }

        return n;

       /* Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.compute(num, (k, v) -> {
                if (v == null) {
                    return 1;
                }
                return v + 1;
            });
        }

        Integer max = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getValue();

        List<Integer> list = map.entrySet().stream().filter(x -> x.getValue() == max).map(e -> e.getKey()).collect(Collectors.toList());

        int m = 50000;
        for (Integer i : list) {
            int start = 0, end = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    start = j;
                    break;
                }
            }

            for (int j = (nums.length - 1); j >= 0; j--) {
                if (nums[j] == i) {
                    end = j;
                    break;
                }
            }

            if ((end - start + 1) < m) {
                m = end - start + 1;
            }
        }
        return m;*/
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }
}
