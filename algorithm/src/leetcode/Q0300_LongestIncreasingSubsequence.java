package leetcode;

public class Q0300_LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
       int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int prev = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > prev) {
                    count++;
                    prev = nums[j];
                }
            }
            max = count > max ? count : max;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {10,9,2,5,3,4};
        System.out.println(lengthOfLIS(a));
    }
}
