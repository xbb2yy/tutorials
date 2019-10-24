package leetcode;

import sun.font.FontRunIterator;

public class Q0033_SearchinRotatedSortedArray {

    public int search(int[] nums, int target) {
        return 0;
    }

    public int solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
