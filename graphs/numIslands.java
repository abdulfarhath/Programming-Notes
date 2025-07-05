class Solution{
	//
	//0110
	//0100
	//0000
	//1000
	public int numIslands(char[][] grid){
		int n = grid.length;
		int m = grid[0].length;
		
		boolean vis[][] = new boolean[n][m];

		for(int i = 0; i<n; i++){
			Arrays.fill(vis[i],false);
		}

		int count = 0;
		for(int i = 0; i<n; i++){
			for(int j = 0; j<m;j++){
				if(grid[i][j] != 0 && !vis[i][j]){
					dfs(grid, vis, i, j);
					count++;
				}
			}
		}
		return count;
	}
	public static void dfs(char[][] grid, boolean[][] vis, int row, int col){
		vis[row][col] = true;
		Stack<int[]> st = new Stack<>();
		//int arr[] = new int[2];
		for(int i = -1; i<=1; i++){
			for(int j = -1; j<=1; j++){
				int r = row + i;
				int c = col + j;
				if(r > 0 && r<n && c > 0 && c<n && grid[r][c] == 1 && !vis[r][c]){
					vis[r][c] = true;
					st.push(new int[]{r,c});
				}
			}
		}
		while(!st.isEmpty()){
			int arr[] = st.pop();
			dfs(grid, vis, arr[0], arr[1]);
		}
	}
}
