package algorithm.c2;

import java.util.Arrays;

public class Quick {
    
    public static void sort(int[] nums) {
        patition(nums, 0, nums.length - 1);
    }

    private static void patition(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }
        int i = quick(nums, start, end);
        patition(nums, start, i - 1);
        patition(nums, i + 1,  end);
    }

    private static int quick(int[] nums, int start, int end) {
        int i = start;
        int k = end;
        for (int j = start + 1; j <= k;) {
            if (nums[j] < nums[start]) {
                i++;
                j++;
            } else {
                int tmp = nums[j];
                nums[j] = nums[k];
                nums[k] = tmp;
                k--;
            }
        }
        int tmp = nums[start];
        nums[start] = nums[i];
        nums[i] = tmp;
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4,9, 2,  7, 2, 3, 5, 3354,4, 34214,2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
