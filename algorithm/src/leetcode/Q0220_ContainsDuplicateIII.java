package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0220_ContainsDuplicateIII {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= k && i + j < nums.length; j++) {
                if (Math.abs((long) nums[i + j] - nums[i]) <= t && Math.abs(nums[i + j] - nums[i]) != Integer.MIN_VALUE) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {-1, 2147483647};
        containsNearbyAlmostDuplicate(a, 1, 2147483647);

        System.out.println(Math.abs(-2147483647 - 2147483647));
    }
}

