class Solution {
    boolean search(int i, int j, int ind, char[][] board, String word, boolean[][] visited){
        if(ind == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length){
            return false;
        }
        if(visited[i][j] || board[i][j] != word.charAt(ind)) return false;

        visited[i][j] = true;
        if( search(i+1, j, ind+1, board, word, visited)||
            search(i-1, j, ind+1, board, word, visited)||
            search(i, j+1, ind+1, board, word, visited)||
            search(i, j-1, ind+1, board, word, visited)
        ) return true;

        visited[i][j] = false;
        return false;
        
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if(search(i, j, 0, board, word, visited)) return true;
                    
                }
            }
        }
        return false;
    }
}