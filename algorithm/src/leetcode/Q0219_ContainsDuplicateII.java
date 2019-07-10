package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;

@Pass
public class Q0219_ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            if (map.containsKey(nums[i])) {
                if (i- map.get(nums[i]) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(a, 2));
    }
}
