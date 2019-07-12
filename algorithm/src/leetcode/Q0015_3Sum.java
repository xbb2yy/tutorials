package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0015_3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> items = new ArrayList<>();
        Arrays.sort(nums);

        Integer prev = null;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (prev != null && nums[i] == prev) {
                continue;
            }
            prev = nums[i];

            Integer s = null;
            for (int j = i + 1; j < nums.length ; j++) {
                if (s != null && s == nums[j]) {
                    continue;
                }
                s = nums[j];
                Integer p = null;
                for (int k = j + 1; k < nums.length; k++) {
                    if (p != null && p == nums[k]) {
                        continue;
                    }
                    p = nums[k];
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        items.add(list);
                    }
                }
            }
        }
        return items;
    }

    public static void main(String[] args) {
        int[] a = {-2,0,1,1,2};
        threeSum(a);
    }
}
