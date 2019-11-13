package leetcode;

public class Q0152_MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int N = nums.length;
        int max = nums[0];
        for (int i = 0; i < N; i++) {
            int tmp = nums[i];
            int k = nums[i];
            for (int j = i + 1; j < N; j++) {
                k *= nums[j];
                tmp = (k > tmp ? k : tmp);
            }
            max = (tmp > max ? tmp : max);
        }
        return max;
    }

    public static int solution(int[] nums) {
        int min = nums[0]; int max = nums[0]; int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tmp = min;
                min = max;
                max = tmp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            ans = Math.max(max, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {2,3,-2,4};

    }
}
