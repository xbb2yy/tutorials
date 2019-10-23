package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0034_FindFirstandLastPositionofElementinSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int[] a = {-1, -1};

        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            }
            if (nums[mid] > target) {
                hi = mid - 1;
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            }
        }
        return a;
    }

    public int[] solution(int[] nums, int target) {

        int[] a = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && a[0] == -1) {
                a[0] = i;
                a[1] = i;
            }
            if (nums[i] == target && a[0] != -1) {
                a[1] = i;
            }
        }
        return a;
    }
}
