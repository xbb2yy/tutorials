package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0088_MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int c = m;
        for (int i = 0; i < n; i++) {
            int[] tmp = new int[nums1.length];
            for (int j = 0; j < c; j++) {

                if (nums2[i] <= nums1[j]) {
                    tmp[j] = nums2[i];
                    for (int k = j; k < c; k++) {
                        tmp[k + 1] = nums1[k];
                    }
                    break;
                } else {
                    if (j == c - 1) {
                        tmp[j] = nums1[j];
                        tmp[c] = nums2[i];
                    } else {
                        tmp[j] = nums1[j];
                    }

                }

            }
            if (m == 0) {
                for (int j = 0; j < n; j++) {
                    nums1[j] = nums2[j];
                }
                return;
            }
            for (int j = 0; j < nums1.length; j++) {
                nums1[j] = tmp[j];
            }
            c++;
        }
    }

    public static void main(String[] args) {
        int[] a = {};
        int[] b = {1};
        merge(a, 0, b, 1);
    }
}
