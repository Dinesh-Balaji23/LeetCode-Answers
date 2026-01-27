class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int total = grid.length * grid[0].length;
        int length = (total * (total + 1)) / 2;
        int hash[] = new int[total + 1];
        int repeated = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(hash[grid[i][j]] == 0) length -= grid[i][j];
                if(hash[grid[i][j]] == 1) repeated = grid[i][j];
                hash[grid[i][j]]++;
            }
        }
        return new int[] {repeated, length};
    }
}