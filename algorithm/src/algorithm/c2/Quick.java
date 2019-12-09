package algorithm.c2;

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
        int  k = end;
        int i = start + 1;
        for (; i <= k; ) {
            if (nums[i] < nums[start]) {
                i++;
            } else {
                int tmp = nums[i];
                nums[i] = nums[end];
                nums[end] = tmp;
                k--;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 4,  7, 2, 3, 5};
        System.out.println(quick(nums, 0, 5));
    }
}
