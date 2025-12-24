class Solution {
    public int path(int m, int n, int[][] memo, int[][] obstacleGrid) {
        if(memo[m][n] != -1) return memo[m][n];
        if(obstacleGrid[m][n] == 1) return memo[m][n] = 0;
        if(m == 0 && n == 0) return memo[m][n] = 1;
        if(m == 0) return memo[m][n] = path(m, n - 1, memo, obstacleGrid);
        if(n == 0) return memo[m][n] = path(m - 1, n, memo, obstacleGrid);
        return memo[m][n] = path(m, n - 1, memo, obstacleGrid) + path(m - 1, n, memo, obstacleGrid);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) Arrays.fill(memo[i], -1);
        return path(m - 1, n - 1, memo, obstacleGrid);
    }
}
