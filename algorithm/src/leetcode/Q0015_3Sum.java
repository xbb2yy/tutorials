package leetcode;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class Q0015_3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> items = new ArrayList<>();

        Set<String> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                break;
            }
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        String s = String.join(",", String.valueOf(nums[i]), String.valueOf(nums[j]),
                                String.valueOf(nums[k]));
                        if (set.contains(s)) {
                            break;
                        }
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        set.add(s);
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
