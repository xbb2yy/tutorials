package leetcode;

public class Q0162_FindPeakElement {

    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] && i + 1 < nums.length && nums[i] > nums[i + 1]) return i;
        }
        return -1;
    }
}
