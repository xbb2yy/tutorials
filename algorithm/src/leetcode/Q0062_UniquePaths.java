package leetcode;

public class Q0062_UniquePaths {

    public int uniquePaths(int m, int n) {
        int min = Math.min(m - 1, n - 1);
        return (int) (Math.pow(2, min) + Math.max(m - 1, n - 1) - min);
    }
}
