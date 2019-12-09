package algorithm.c2;


import java.util.Arrays;

public class Merge {

    public static void sort(int[] nums) {
        sort(nums, 0, nums.length - 1);
    }

    private static void sort(int[] nums, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        sort(nums, start, mid);
        sort(nums, mid + 1, end); 
        merge(nums, start, end);
    }

    private static void merge(int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;
        int[] tmp = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            tmp[i - start] = nums[i];
        }

        int m = 0, n = mid - start + 1;
        for (int i = 0; i < tmp.length; i++) {
            if (n >= tmp.length) {
                nums[start + i] = tmp[m];
                m++;
            } else if (m >  mid - start) {
                nums[start + i] = tmp[n];
                n++;
            } else if (tmp[m] < tmp[n]) {
                nums[start + i] = tmp[m];
                m++;
            } else {
                nums[start + i] = tmp[n];
                n++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {32, 78, 22, 56, 45, 67, 23, 45, 56}; // , 34, 43, 2, 66, 23, 77, 55
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
