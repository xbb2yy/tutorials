package leetcode;

public class Q0494_TargetSum {

    private int ans = 0, S;

    public int findTargetSumWays(int[] nums, int S) {
        this.S = S;
        help(nums, 0, nums[0]);
        help(nums, 0, -nums[0]);
        return ans;
    }

    private void help(int[] nums, int index, int sum) {
        if (index == nums.length - 1) {
            if (sum == S) {
                ans++;
            }
            return;
        }
        help(nums, index + 1, sum - nums[index + 1]);
        help(nums, index + 1, sum +  nums[index + 1]);
    }
}
