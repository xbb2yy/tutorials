package leetcode;

public class Q0064_MinimumPathSum {

    public int minPathSum(int[][] grid) {
        return help(grid, grid.length, grid[0].length);
    }

    private int help(int[][] grid, int m, int n) {
        if (m == 0 && n == 0) return grid[0][0];
        if (m == 0) return grid[0][n] + help(grid, 0, n - 1);
        if (m == 0) return grid[m][0] + help(grid, m - 1, 0);
        return grid[m][n] + Math.min(help(grid, m - 1, n), help(grid, m, n - 1));
    }
}
