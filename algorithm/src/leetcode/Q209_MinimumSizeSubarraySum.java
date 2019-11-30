package leetcode;

public class Q209_MinimumSizeSubarraySum {

    public static int minSubArrayLen(int s, int[] nums) {

        int start = 0, end = 0;
        if(nums.length == 0) return 0;
        int ans = nums.length + 1;
        int sum = nums[0];
        while (start <= end ) {
            if (sum < s && end + 1 < nums.length) {
                end++;
                sum += nums[end];
            }
            if (sum >= s){
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }

        }
        if (ans == nums.length + 1) return 0;
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7, a));
    }
}
