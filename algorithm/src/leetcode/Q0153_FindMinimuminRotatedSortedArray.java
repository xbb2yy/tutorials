package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0153_FindMinimuminRotatedSortedArray {

    public int findMin(int[] nums) {

        int min = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] < nums[i - 1]) {
                min = nums[i];
            }
        }
        return min;
    }
}
