package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0080_RemoveDuplicatesfromSortedArrayII {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int cur = 1;
        int prev = nums[0];

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                if (count == 1) {
                    nums[cur] = nums[i];
                    cur++;
                    count++;
                }
            } else {
                nums[cur] = nums[i];
                cur++;
                prev = nums[i];
                count = 1;
            }
        }

        return cur;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 3};
        removeDuplicates(a);
    }
}
