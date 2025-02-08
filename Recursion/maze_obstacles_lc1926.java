//error in the code

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int val = backtracking(maze,entrance,maze.length,maze[0].length,entrance[0]-1,entrance[1]-1,0,Integer.MAX_VALUE);
        System.out.print(val);
        return val;
    }

    static int backtracking(char[][] maze,int[] entrance, int rlen, int clen, int r, int c,int count, int min){
        if(r == 0 || c == 0){
            min = Math.min(min,count);
            return min;
        }
        if(maze[r][c] == '+'){
            return min;
        }
        int up = 0,down = 0,left = 0,right = 0;
        //up
        if(r>0){
            up += backtracking(maze,entrance,rlen,clen,r-1,c,count+1,min);
        }
        //down
        if(r<rlen){
            down += backtracking(maze,entrance,rlen,clen,r+1,c,count+1,min);
        }
        //left
        if(c>0){
            left += backtracking(maze,entrance,rlen,clen,r,c-1,count+1,min);
        }
        //right
        if(c<clen){
            right += backtracking(maze,entrance,rlen,clen,r,c+1,count+1,min);
        }
        return Math.min(min,up+down+left+right);
    }
}