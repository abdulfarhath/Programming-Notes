class Solution {
    public boolean isCycle(int v, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> gph =new ArrayList<>();
        for(int i=0;i<v;i++){
            gph.add(new ArrayList<>());
            
        }
        for(int i=0;i<edges.length;i++){
            gph.get(edges[i][0]).add(edges[i][1]);
            gph.get(edges[i][1]).add(edges[i][0]);
        }
        
        boolean vis[]=new boolean[v];
        
        for(int i=0;i<v;i++){
            if(!vis[i]){
            		if(dfs(gph, i, -1, vis)) return true;
		}
        }
        return false;
       
      }
      
	public static boolean bfs(ArrayList<ArrayList<Integer>> adj,int v, boolean vis[]){
		Queue<Integer> q = new LinkedList<>();
		int numvisited = 0;
		q.offer(v);

		while(!q.isEmpty()){
			int x = q.poll();
			vis[x] = true;
			numvisited = 0;
			for(int itr : adj.get(x)){
				if(!vis[itr]){
					q.offer(itr);
				}else numvisited++;
			}
			if(numvisited >= 2) return true;
		}
		return false;
	}
    
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj, int node, int parent, boolean[] vis) {
        vis[node] = true;
    
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                if (dfs(adj, neighbor, node, vis)) return true;
            } else if (neighbor != parent) {
                // Visited neighbor not equal to parent → cycle
                return true;
            }
        }
    
        return false;
    }

         
    
}
