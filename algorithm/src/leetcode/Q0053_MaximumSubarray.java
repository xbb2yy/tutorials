package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0053_MaximumSubarray {

    /**
     *
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int end = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            end = Math.max(end + nums[i], nums[i]);
            max = Math.max(max, end);

        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(a);
    }
}
