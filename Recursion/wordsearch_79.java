class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        boolean visited[][] = new boolean[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(recursion(board, word, "", visited, i, j)) return true;        
            }
        }
        return false;
    }
    static boolean recursion(char[][] board, String word, String sb, boolean[][] visited, int r, int c){

        if(sb.equals(word)) return true;
        if(visited[r][c]) return false;

        char ch = board[r][c];
        visited[r][c] = true;        
        
        boolean up = false,down = false,left = false, right = false;
        //up
        if(r > 0){
            up = recursion(board, word, sb+ch, visited, r-1, c);
        }
        //down
        if(r < board.length-1){
            down = recursion(board, word, sb+ch, visited, r+1, c);
        }
        //left
        if(c > 0){
            left = recursion(board, word, sb+ch, visited, r, c-1);
        }
        //right
        if(c < board[0].length-1){
            right = recursion(board, word, sb+ch, visited, r, c+1);
        }

        visited[r][c] = false;

        return up || down || left || right;
    }
}