import java.util.*;

class views{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		Node root = null;
		for(int i = 0; i<5 ; i++){
			System.out.println("val : ");
			root = fillBT(root,sc.nextInt(),sc);
		}

		System.out.println("lvl order** : ");
		List<List<Integer>> levels = new ArrayList<>();
		lvlOrder(root,levels, 0);
		for(int i = 0; i<levels.size(); i++){
			System.out.println(levels.get(i));
		}
	}

	//Level Order
	static void lvlOrder(Node root, List<List<Integer>> levels, int lvl){
		if(root == null) return;
		if(levels.size()==lvl) levels.add(new ArrayList<Integer>());
		levels.get(lvl).add(root.val);
		lvlOrder(root.left,levels,lvl+1);
		lvlOrder(root.right,levels,lvl+1);
	}
	
	//FILL DESIRED ORDER
	// FILL DESIRED ORDER (Recursive)
	static Node fillBT(Node root, int val, Scanner sc) {
	    if (root == null) {
	        System.out.println("Node created: " + val);
	        return new Node(val);
	    }

	    // Ask the user for the direction (left or right)
	    System.out.println("At node " + root.val + ". Choose direction to insert " + val + " (l/r): ");
	    String dir = sc.next();

	    // Traverse left or right based on user input
	    if (dir.equals("l")) {
	        // Insert into the left child recursively
	        root.left = fillBT(root.left, val, sc);
	        if (root.left != null) {
	            System.out.println("Inserted " + val + " to the left of " + root.val);
	        }
	    } else {
	        // Insert into the right child recursively
	        root.right = fillBT(root.right, val, sc);
	        if (root.right != null) {
	            System.out.println("Inserted " + val + " to the right of " + root.val);
	        }
	    }

	    return root;
	}



	//right view
	static void rightView(Node root){

	}

	//left view
	static void leftView(Node root){

	}

	//top view
	static void topView(Node root){

	}

	//bottom view
	static void bottomView(Node root){

	}

}
class Node{
	int val;
	int depth;
	Node left,right;
	Node(int val){
		this.val = val;
		this.left = this.right = null;
	}
}
