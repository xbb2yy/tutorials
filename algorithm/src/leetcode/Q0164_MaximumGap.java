package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;

@Pass
public class Q0164_MaximumGap {

    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans, nums[i] - nums[i - 1]);
        }
        return ans;
    }
}
