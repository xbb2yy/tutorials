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

        int k = 0, i = 0, j = 0;

        int m = (nums1.length + nums2.length) / 2;
        int[] t = new int[m + 1];

        while (k < m + 1) {
            if (nums1.length == 0) {
                t[k] = nums2[j];
                j++;
                k++;
                continue;
            }
            if (nums2.length == 0) {
                t[k] = nums1[i];
                i++;
                k++;
                continue;
            }
            if (j >= nums2.length) {
                t[k] = nums1[i];
                i++;
                k++;
                continue;
            }
            if (i < nums1.length && nums1[i] < nums2[j]) {
                t[k] = nums1[i];
                i++;
            } else {
                t[k] = nums2[j];
                j++;
            }
            k++;
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (t[m - 1] + t[m]) / 2.0;
        } else {
            return t[m];
        }
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1};
        System.out.println(solution(a, b));
    }
}
