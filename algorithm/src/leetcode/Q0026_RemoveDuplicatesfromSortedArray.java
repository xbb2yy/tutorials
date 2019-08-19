package leetcode;

public class Q0026_RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == prev) {
                continue;
            }
            prev = nums[i];
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(removeDuplicates(a));
    }
}
