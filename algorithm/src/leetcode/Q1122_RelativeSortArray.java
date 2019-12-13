package leetcode;

import java.util.Arrays;

public class Q1122_RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        int[] ans = new int[arr1.length];
        int start = 0;
        boolean[] flag = new boolean[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    flag[j] = true;
                    ans[start++] = arr1[j];
                    int next = j + 1;
                    while (next < arr1.length && arr1[next] == arr1[j]) {
                        flag[next] = true;
                        ans[start++] = arr1[next++];
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                ans[start++] = arr1[i];
            }
        }
        return ans;
    }
}
