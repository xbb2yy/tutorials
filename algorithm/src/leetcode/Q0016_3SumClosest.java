package leetcode;

import java.util.Arrays;

public class Q0016_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {

        int min = Integer.MAX_VALUE, sum = 0, N = nums.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (Math.abs((target - (nums[i] + nums[j] + nums[k]))) < min) {
                        min = Math.abs((target - (nums[i] + nums[j] + nums[k])));
                        sum = nums[i] + nums[j] + nums[k];
                        if (min == 0) {
                            return sum;
                        }
                    }
                }
            }
        }
        return sum;
    }

    public int solution(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum > target) {
                    end--;
                }
                if (sum < target) {
                    start++;
                }
                if (sum == target) {
                    return sum;
                }
            }
        }

        return ans;
    }
}
