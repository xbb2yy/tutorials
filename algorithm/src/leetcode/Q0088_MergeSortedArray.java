package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;

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


    public static void solution(int[] nums1, int m, int[] nums2, int n) {

        int t = m;
        for (int i = 0; i < n; i++) {
            nums1[t] = nums2[i];
            for(int k = t; t > 0; k--) {
                if (nums1[k] < nums1[k - 1]) {
                    int tmp = nums1[k];
                    nums1[k] = nums1[k - 1];
                    nums1[k - 1] = tmp;
                } else {
                    break;
                }
            }
            t++;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2, 5, 6};
        solution(a, 3, b, 3);
        System.out.println(Arrays.toString(a));
    }
}
