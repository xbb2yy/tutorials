package leetcode;

public class Q1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int max = 1;
        int tmp = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == difference) {
                tmp++;
            } else {
                if (tmp > max) {
                    max = tmp;
                }
                tmp = 1;
            }
        }
        return max > tmp ? max : tmp;
    }
}
