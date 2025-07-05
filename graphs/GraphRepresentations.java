// GraphRepresentations.java

public class GraphRepresentations {
    public static void main(String[] args) {
        
        // ==============================
        // 1. Adjacency Matrix
        // ==============================
        // Used when graph is dense (many edges)
        // Fast edge lookup: O(1)
        // Space: O(V^2)
        int V = 4; // number of vertices
        int[][] adjMatrix = new int[V][V];

        // Undirected edge between 0 and 1
        adjMatrix[0][1] = 1;
        adjMatrix[1][0] = 1;

        // Undirected edge between 0 and 2
        adjMatrix[0][2] = 1;
        adjMatrix[2][0] = 1;

        // Print adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // ==============================
        // 2. Adjacency List
        // ==============================
        // Used when graph is sparse
        // Efficient space: O(V + E)
        // Slower edge lookup
        System.out.println("\nAdjacency List:");
        java.util.List<java.util.List<Integer>> adjList = new java.util.ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new java.util.ArrayList<>());
        }

        // Add edges
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(0).add(2);
        adjList.get(2).add(0);
        adjList.get(1).add(3);
        adjList.get(3).add(1);

        // Print adjacency list
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        // ==============================
        // 3. Edge List
        // ==============================
        // List of all edges
        // Useful for Kruskal’s algorithm
        System.out.println("\nEdge List:");
        java.util.List<int[]> edgeList = new java.util.ArrayList<>();
        edgeList.add(new int[]{0, 1});
        edgeList.add(new int[]{0, 2});
        edgeList.add(new int[]{1, 3});

        for (int[] edge : edgeList) {
            System.out.println(edge[0] + " - " + edge[1]);
        }

        // ==============================
        // 4. HashMap with Sets (for custom labels)
        // ==============================
        // Used when vertex names are strings
        System.out.println("\nHashMap Graph:");
        java.util.Map<String, java.util.Set<String>> mapGraph = new java.util.HashMap<>();

        // Add edges
        mapGraph.putIfAbsent("A", new java.util.HashSet<>());
        mapGraph.get("A").add("B");

        mapGraph.putIfAbsent("B", new java.util.HashSet<>());
        mapGraph.get("B").add("C");

        // Print map
        for (String node : mapGraph.keySet()) {
            System.out.print(node + " -> ");
            for (String neighbor : mapGraph.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        // ==============================
        // 5. Object-Oriented Graph (Node class)
        // ==============================
        // Best for complex graph modeling
        System.out.println("\nOOP Graph Representation:");
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.neighbors.add(b);
        b.neighbors.add(c);

        // Print graph using OOP
        System.out.println("Node " + a.val + " -> " + a.neighbors.get(0).val);
        System.out.println("Node " + b.val + " -> " + b.neighbors.get(0).val);
    }
}

// Class for OOP graph representation
class Node {
    int val;
    java.util.List<Node> neighbors;

    Node(int val) {
        this.val = val;
        this.neighbors = new java.util.ArrayList<>();
    }
}

