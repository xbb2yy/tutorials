package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Pass
public class Q0015_3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> items = new ArrayList<>();
        Arrays.sort(nums);
        int N = nums.length;

        int prev = 1;
        for (int i = 0; i < N; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (nums[i] == prev) {
                continue;
            }
            prev = nums[i];
            Integer integer = null;
            for (int j = i + 1; j < N; j++) {
                if (nums[i] + nums[j] > 0) {
                    break;
                }
                if (integer != null) {
                    if (integer == nums[j])
                        continue;
                }
                integer = nums[j];
                int i1 = Arrays.binarySearch(nums, j + 1, N, -(nums[i] + nums[j]));
                if (i1 >= -1) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[i1]);
                    items.add(list);
                }
            }
        }
        return items;
    }

    /**
     * 这个解会超时
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> solution1(int[] nums) {

        List<List<Integer>> items = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        int prev = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (nums[i] == prev) {
                continue;
            }
            prev = nums[i];

            Integer integer = null;
            for (int j = i + 1; j < n; j++) {
                if (integer != null) {
                    if (integer == nums[j])
                        continue;
                }
                integer = nums[j];

                Integer in = null;
                for (int k = j + 1; k < n; k++) {
                    if (in != null) {
                        if (in == nums[k])
                            continue;
                    }
                    in = nums[k];
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
        int[] a = {-2, 0, 0, 2, 2};
        solution1(a);
    }
}
