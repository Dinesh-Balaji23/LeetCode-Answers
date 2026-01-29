class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int total = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] != 0) total++;
                if(grid[i][j] == 2) q.add(new int[]{i, j});
            }
        }
        
        int time = 0;
        int count = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int size = q.size();
            count += size;
            for(int k = 0; k < size; k++){
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];
                for(int[] d : dir){
                    int nx = x + d[0];
                    int ny = y + d[1];
                    if(nx < 0 || ny < 0 || nx >= m || ny >= n || grid[nx][ny] != 1) continue;
                    grid[nx][ny] = 2;
                    q.add(new int[]{nx, ny});
                }
            }
            if(!q.isEmpty()) time++;
        }
        if(count == total) return time;
        return -1;
    }
}