import java.util.*;

public class Traversals{
	public static void main(String[] args) {
		Node root = new Node(2);
		root.left = new Node(3);
		root.right = new Node(4);
		root.left.left = new Node(5);
		root.left.right = new Node(6);
		System.out.print("pre : ");
		preorder(root);
		System.out.println();

		System.out.print("in : ");
		inorder(root);
		System.out.println();

		System.out.print("post : ");
		postorder(root);
		System.out.println();
		ArrayList<Integer> list = preorderTraversal(root);

		System.out.print("preorder ret al : ");
		for(int i = 0; i<list.size(); i++){
			System.out.print(list.get(i));
		}
		System.out.println();


		System.out.println("lvl order** : ");
		List<List<Integer>> levels = new ArrayList<>();
		lvlOrder(root,levels, 0);
		for(int i = 0; i<levels.size(); i++){
			System.out.println(levels.get(i));
		}
	}

	private static void lvlOrder(Node root, List<List<Integer>> levels, int lvl){
		if(root == null) return;

		if(levels.size() <= lvl){
			levels.add(new ArrayList<Integer>());
		}

		levels.get(lvl).add(root.val);

		lvlOrder(root.left, levels, lvl+1);
		lvlOrder(root.right, levels, lvl+1);
	}

	private static void preorder(Node root){
		if(root == null) return;
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static ArrayList<Integer> preorderTraversal(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        list.add(root.val);
		list.addAll(preorderTraversal(root.left));
		list.addAll(preorderTraversal(root.right));
        return list;
    }

	private static void postorder(Node root){
		if(root == null) return;
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.val + " ");
	}

	private static void inorder(Node root){
		if(root == null) return;
		preorder(root.left);
		System.out.print(root.val + " ");
		preorder(root.right);
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

