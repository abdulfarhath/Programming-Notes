//BFS

class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v = adj.size();
        boolean visited[] = new boolean[v];
        Arrays.fill(visited,false);
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visited[0] = true;
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        
        while(!q.isEmpty()){
            
            int curr = q.poll();
            
            List<Integer> list = adj.get(curr);
            
            for(int x : list){
                if(!visited[x]){
                    visited[x] = true;
                    ans.add(x);
                    q.offer(x);
                }
            }
        }
        
        return ans;
    }
}

//dfs
//my code 


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        boolean visited[] = new boolean[adj.size()];
        visited[0] = true;
        solve(list,adj,st,visited);
        return list;
    }
    public static void solve(ArrayList<Integer> list,ArrayList<ArrayList<Integer>> adj, Stack<Integer> st, boolean visited[]){
        if(!st.isEmpty()){
            int x = st.peek();
            int n = adj.get(x).size();
            boolean pushed = false;
            for(int i = 0; i<n; i++){
                int ele = adj.get(x).get(i);
                if(!visited[ele]){
                    visited[ele] = true;
                    st.push(ele);
                    list.add(ele);
                    pushed = true;
                    break;
                }
            }
            if(!pushed){
                // list.add(st.pop());
                st.pop();
            }
            solve(list,adj,st,visited);
        }
    }
}

//best code by cgpt
//

import java.util.*;

class Solution {
    // Function to return the DFS traversal of the graph starting from node 0
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size(); // number of vertices
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();

        // Start DFS from node 0
        dfsUtil(0, adj, visited, result);

        return result;
    }

    // Helper recursive function for DFS
    private void dfsUtil(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);

        // Explore all unvisited neighbors
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, adj, visited, result);
            }
        }
    }
}


