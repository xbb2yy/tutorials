package leetcode;

import java.util.Arrays;

public class Q0041_FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int min = 0;
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }

            if (next - min > 1) {
                return min + 1;
            }

            if (next == 0) {
                next = nums[i];
            }

            if (next - min == 1 && nums[i] > next) {
                min = next;
                next = nums[i];
            }
        }
        if (next - min > 1) {
            return min + 1;
        }

        return next + 1;
    }

    public static void main(String[] args) {
        int[] ints = {2, 1};
        System.out.println(firstMissingPositive(ints));
    }
}
