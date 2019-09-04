package leetcode;

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
}
