class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        if(r == 1 && c == 1) return (Character.toString(board[0][0]).equals(word)); 
        boolean visited[][] = new boolean[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(recursion(board, word, 0, visited, i, j)) return true;        
            }
        }
        return false;
    }
    static boolean recursion(char[][] board, String word, int idx, boolean[][] visited, int r, int c){

        if(r<0 || c<0 || r>=board.length || c>=board[0].length)return false;
        if(idx == word.length()) return true;
        if(board[r][c] != word.charAt(idx)) return false;
        if(visited[r][c]) return false;

        visited[r][c] = true;        
        
        boolean up = false,down = false,left = false, right = false;
        //up
        up = recursion(board, word, idx+1, visited, r-1, c);
        //down
        down = recursion(board, word, idx+1, visited, r+1, c);
        //left
        left = recursion(board, word, idx+1, visited, r, c-1);
        //right
        right = recursion(board, word, idx+1, visited, r, c+1);

        visited[r][c] = false;

        return up || down || left || right;
    }
}