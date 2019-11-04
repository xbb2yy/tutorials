package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0198_HouseRobber {

    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        return help(nums, nums.length - 1);
    }

    private static int help(int[] nums, int n) {
        if (n == 0) {
            return nums[0];
        }
        if (n == 1) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(help(nums, n - 1), help(nums,n - 2) + nums[n]);
    }

    public static int solution(int[] nums) {

        int N = nums.length;
        if (N == 0) return 0;
        if (N == 1) {
            return nums[0];
        }
        if (N == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] a = new int[N];
        int pre2 = a[0] = nums[0];
        int pre = a[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < N; i++) {
            a[i] = Math.max(pre, pre2 + nums[i]);
            pre = a[i];
            pre2 = a[i - 1];
        }
        return a[N - 1];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1};
        System.out.println(solution(a));
    }
}
