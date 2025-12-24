class Solution {
    public boolean isSafe(boolean[][] vis, int i, int j, int m, int n){
        return (i>=0 && j >=0 && i<m && j<n && !vis[i][j]);
    }
    public boolean rec(int i, int j, int index, int m, int n, char[][] board, String word, boolean[][] vis){
        if(index == word.length()) return true;
        if(!isSafe(vis,i,j,m,n) || board[i][j]!=word.charAt(index)) return false;
        vis[i][j]=true;
        boolean left = rec(i - 1, j, index + 1, m, n, board, word, vis);
        boolean right = rec(i + 1, j, index + 1, m, n, board, word, vis);
        boolean up = rec(i, j - 1, index + 1, m, n, board, word, vis);
        boolean down = rec(i, j + 1, index + 1, m, n, board, word, vis);
        vis[i][j]=false;
        return left || right || up || down;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] vis = new boolean[m][n];
                    if(rec(i,j,0,m,n,board,word,vis)) return true;
                }
            }
        }
        return false;
    }
}