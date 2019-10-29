package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0075_SortColors {

    public static void sortColors(int[] nums) {
        for (int i = 0, j = nums.length - 1, k = 0; i <= j ; k++) {
            if (nums[k] == 2) {
                nums[k] = nums[j];
                nums[j] = 2;
                j--;
                k--;
                continue;
            }
            if (nums[k] == 0) {
                nums[k] = nums[i];
                nums[i] = 0;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};
        sortColors(a);
    }
}
