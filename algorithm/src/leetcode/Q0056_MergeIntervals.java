package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q0056_MergeIntervals {
    public static int[][] merge(int[][] intervals) {

        int max = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] > max) {
                max = intervals[i][1];
            }
        }

        boolean[] flag = new boolean[max + 2];

        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                flag[j] = true;
            }
        }

        boolean start = true;
        int[] a = null;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] && start) {
                a = new int[2];
                a[0] = i;
                start = false;
            }
            if (!flag[i] && !start) {
                a[1] = i - 1;
                start = true;
                list.add(a);
            }
        }
        int[][] r = new int[list.size()][2];
        list.toArray(r);
        return r;
    }

    public static int[][] solution(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][2];
        Arrays.sort(intervals, Comparator.comparing(ints -> ints[0]));
        int start = intervals[0][0], end = intervals[0][1];
        int[][] ans = new int[intervals.length][2];
        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > end) {
                int[] a = {start, end};
                ans[index++] = a;
                start = intervals[i][0];
            }
            if (intervals[i][1] > end) end = intervals[i][1];
        }
        int[] last = {start, end};
        ans[index++] = last;
        int[][] a = new int[index][2];
        System.arraycopy(ans, 0, a, 0, a.length);
        return a;
    }

    public static void main(String[] args) {
        int[][] a = {{2, 6}, {8, 10}, {15, 18}, {1, 3}};
        solution(a);
    }
}
