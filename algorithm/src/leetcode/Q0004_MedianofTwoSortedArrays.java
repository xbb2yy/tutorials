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

    public static double solution(int[] nums1, int[] nums2) {
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

    public double solution2(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merge = new int[m + n];
        System.arraycopy(nums1, 0, merge, 0, m);
        System.arraycopy(nums2, 0, merge, m, n);

        Arrays.sort(merge);

        if (((m + n) & 1) == 1) {
            return merge[(m + n - 1) >>> 1];
        } else {
            return (double) (merge[(m + n - 1) >>> 1] + merge[(m + n) >>> 1]) / 2;
        }
    }


    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1};
        System.out.println(solution(a, b));
    }
}
