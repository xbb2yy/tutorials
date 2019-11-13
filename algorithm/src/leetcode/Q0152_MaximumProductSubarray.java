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
}
