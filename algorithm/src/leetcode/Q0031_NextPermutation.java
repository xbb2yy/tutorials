package leetcode;

public class Q0031_NextPermutation {
    public static void nextPermutation(int[] nums) {
        int N = nums.length;

        boolean find = false;
        for (int i = N - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int tmp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = tmp;
                find = true;
                break;
            }
        }
        if (!find) {
            for (int i = 0, j = N - 1; i < j; i++, j --) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1};
        nextPermutation(a);
    }
}
