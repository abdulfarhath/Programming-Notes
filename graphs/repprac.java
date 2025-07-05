import java.util.*;

public class repprac{
	public static void main(String args[]){
		//adjacency matrix rep

		int v = 5;
		int [][] graph = new int[v][v];

		graph[0][0] = 1
		graph[1][0] = 1;

		//adjacency list

		List<List<Integer>> adjlist = new ArrayList<>();
		
		for(int i = 0; i<v; i++){
			adjlist.add(new ArrayList<>());
		}

		adjlist.get(0).add(1);
		adjlist.get(0).add(2);
		
		
		
	}
}
