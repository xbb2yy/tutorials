package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0485_MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                max = count > max ? count : max;
                count = 0;
            }
        }
        return count > max ? count : max;
    }
}
