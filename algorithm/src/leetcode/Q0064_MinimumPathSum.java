package leetcode;

public class Q0064_MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0) {
                    grid[i][j] = grid[0][j - 1] + grid[i][j];
                    continue;
                }
                if (j == 0) {
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                    continue;
                }
                grid[i][j] = grid[i][j] + Math.min(grid[i][j - 1], grid[i - 1][j]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

    private int help(int[][] grid, int m, int n) {
        if (m == 0 && n == 0)
            return grid[0][0];
        if (m == 0)
            return grid[0][n] + help(grid, 0, n - 1);
        if (m == 0)
            return grid[m][0] + help(grid, m - 1, 0);
        return grid[m][n] + Math.min(help(grid, m - 1, n), help(grid, m, n - 1));
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        minPathSum(a);
    }
}
