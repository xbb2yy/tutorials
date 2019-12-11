package leetcode;

import java.util.Arrays;

public class Q0455_AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length;) {
            if (g[i] <= s[j]) {
                count++;
                j++;
                i++;
            } else {
               j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {10, 9, 8, 7};
        int[] b = {5, 6, 7, 8};
        findContentChildren(a, b);
    }
}
