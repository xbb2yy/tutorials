package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;

@Pass
public class Q0004_MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length ; i++) {
            a[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            a[i + nums1.length] = nums2[i];
        }

        Arrays.sort(a);
        if (a.length % 2 == 0) {
            return (a[a.length / 2 - 1] + a[a.length / 2]) / 2.0;
        } else {
            return a[a.length / 2];
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        findMedianSortedArrays(a, b);
    }
}
