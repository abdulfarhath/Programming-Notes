
// ALGORITHM: DFS
// ALGORITHM: KHAN'S - BFS

class Solution {
    public static ArrayList<Integer> topoSort(int v, int[][] edges) {
        // code here
        boolean vis[] = new boolean[v];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i<v; i++) adj.add(new ArrayList<>());
        
        for(int x[] : edges){
            adj.get(x[0]).add(x[1]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        //USING DFS
        
        // for(int i = 0; i<v; i++){
        //     if(!vis[i]){
        //         dfs(adj, i, vis, list);
        //     }
        // }
        // Collections.reverse(list);
        
        // return list;
        
        //khans algo BFS
        return bfs(adj);
        
        
        
    }
    
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        
        //fill indegree array
        int indeg[] = new int[adj.size()];
        for(ArrayList<Integer> lst : adj){
            for(int x : lst){
                indeg[x]++;
            }
        }
        

        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i<adj.size(); i++)
            if(indeg[i] == 0)
                q.offer(i);
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(!q.isEmpty()){
            int x = q.poll();
            list.add(x);
            
            for(int y : adj.get(x)){
                indeg[y]--;
                if(indeg[y] == 0){
                    q.offer(y);
                    // list.add(y);
                } 
            }
        }
        
        return list;
        
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean vis[], ArrayList<Integer> list){
        vis[node] = true;
        
        for(int x : adj.get(node)){
            if(!vis[x]) dfs(adj, x, vis, list);
        }
        
        list.add(node);
    }
}
