package algorithm.c2;


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
    }

    public static void main(String[] args) {
        int[] a = {32, 78, 22}; // , 34, 43, 2, 66, 23, 77, 55
        sort(a);
    }
}
