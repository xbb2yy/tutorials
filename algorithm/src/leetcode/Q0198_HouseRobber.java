package leetcode;

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

    public static void main(String[] args) {
        int[] a = {2, 7, 9, 3, 1};
        System.out.println(rob(a));
    }
}
