package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;

@Pass
public class Q0215_KthLargestElementinanArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
