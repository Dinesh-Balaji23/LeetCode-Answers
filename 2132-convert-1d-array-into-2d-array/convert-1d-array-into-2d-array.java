class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int x = 0;
        if(original.length > m * n || original.length < m * n) return new int[][] {};
        int res[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) res[i][j] = original[x++];
        }
        return res;
    }
}