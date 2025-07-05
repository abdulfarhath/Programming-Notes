import java.util.*;

public class _01Matrix{

}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j] == 1){
                    res[i][j] = bfs();
                }
            }
        }

        return res;
    }
    private static final int[] dx = { 0 , 0, 1, -1};
    private static final int[] dy = {1 , -1, 0,  0};

    
    
}