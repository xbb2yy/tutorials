package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.Map;

@Pass
public class Q0001_TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] a = new int[2];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }

        return a;
    }

    /**
     * O(n) 解法
     * @param nums
     * @param target
     * @return
     */
    public int[] solution(int[] nums, int target) {

        int[] a = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(target - nums[i])) {
                a[0] = map.get(target - nums[i]);
                a[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return a;
    }
}
