import java.util.*;

public class Trees{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		while(n-->0){
			root = insertBst(root,sc.nextInt());
		}
		inorder(root);
	}
	public static Node insertBst(Node root, int val){
		if(root == null) return new Node(val);
        if(val < root.val) root.left = insertBst(root.left,val);
        if(val > root.val ) root.right = insertBst(root.right,val);
        return root; 
	}
	public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}	

class Node{
	int val;
	Node left,right;
	Node(int val){this.val = val; this.left = this.right = null;}
}