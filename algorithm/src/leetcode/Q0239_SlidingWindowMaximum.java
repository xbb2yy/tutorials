package leetcode;

import java.util.Arrays;

public class Q0239_SlidingWindowMaximum {


    public static int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 0) {
            return new int[0];
        }
        int[] n = new int[nums.length - k + 1];

        for (int i = 0; i <= nums.length - k; i++) {
            int max = nums[i];
            for (int j = i; j < k + i; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            n[i] = max;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = {1, -1};
        System.out.println(Arrays.toString(maxSlidingWindow(a, 3)));
    }
}
