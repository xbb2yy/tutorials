package leetcode;

import java.util.Arrays;

public class Q1122_RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        int start = 0, end = arr1.length - 1;

        int[] ans = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            int index = Arrays.binarySearch(arr1, start, arr1.length, arr2[i]);
            while (index != -1) {
                int tmp = arr1[start];
                arr1[start] = arr1[index];
                arr1[index] = tmp;
                start++;
            }
        }
        return ans;
    }
}
