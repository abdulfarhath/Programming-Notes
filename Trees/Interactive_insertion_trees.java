import java.util.*;

public class Interactive_insertion_trees{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of nodes to insert? : ");
		int n = sc.nextInt();
		Node root = null;
		while(n-->0){
			System.out.println("val : ");
			int val = sc.nextInt();
			root = interactive_insertion(root,val,sc);
		}
		List<List<Integer>> levels = new ArrayList<Integer>();
	}
	//HERE : everytime traverse from root node and then insert by asking user
	private static Node interactive_insertion(Node root, int val, Scanner sc){
		if(root == null){
			System.out.println("node created : " + val);
			return new Node(val);
		}
		System.out.println("at root node : "+ root.val + "go left or right ?");
		if(sc.next().equals("l")){
			root.left = interactive_insertion(root.left,val,sc);
		}else{
			root.right = interactive_insertion(root.right,val,sc);
		}
		return root;
	}
	//HERE : continuously insert values from the position itself going back and fro
	private static Node continuous_insertion(Node root, int val){
		return root;
	}

	private static List<List<Integer>> lvlOrder(Node root, int lvl, List<List<Integer>> levels){
		if(root == null){
			return levels;
		}
	}
}

class Node{
	int val;
	Node left,right;
	Node(int val){this.val = val;}
}