package leetcode;

public class Q0057_InsertInterval {

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] a = new int[intervals.length + 1][2];
        int index = 0, start = newInterval[0];
        boolean hasInsert = false;
        for (int i = 0; i < intervals.length; i++) {
            if (newInterval[0] <= intervals[i][1] && !hasInsert) {
               start = Math.min(start, intervals[i][0]);
                if (newInterval[1] < intervals[i][0]) {
                    int[] t = {start, newInterval[1]};
                    a[index++] = t;
                    a[index++] = intervals[i];
                    hasInsert = true;
                    continue;
                }
                if (intervals[i][1] >= newInterval[1]) {
                    int[] t = {start, intervals[i][1]};
                    a[index++] = t;
                    hasInsert = true;
                    continue;
                }
            } else {
                a[index++] = intervals[i];
            }
        }
        if (!hasInsert) {
            int[] t = {start, newInterval[1]};
            a[index++] = t;
        }
        int[][] ans = new int[index][2];
        System.arraycopy(a, 0, ans, 0, index);
        return ans;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3},{6, 9}};
        int[] n = {2, 5};
        insert(a, n);
    }
}
