package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0026_RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int prev = nums[0];
        int  replace = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                nums[replace] = nums[i];
                prev = nums[i];
                replace++;
            }
        }
        return replace;

    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(removeDuplicates(a));
    }
}
