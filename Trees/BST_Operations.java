import java.util.*;

public class BST_Operations {
    public static void main(String[] args) {
        Node root = null;
        root = seedBst(root);
        System.out.println("helo");
        inorder(root); // optional: to check the structure
    }

    public static Node seedBst(Node root) {
        int[] values = {10, 5, 15, 3, 7, 12, 18};
        for (int val : values) {
            root = Insert(root, val);
        }
        return root;
    }

    public static Node Insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val)
            root.left = Insert(root.left, val);
        else if (val > root.val)
            root.right = Insert(root.right, val);
        return root;
    }

    public static Node Delete(Node root, int val) {
        if (root == null) return null;

        if (val < root.val) {
            root.left = Delete(root.left, val);
        } else if (val > root.val) {
            root.right = Delete(root.right, val);
        } else {
            // Node to be deleted found
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            Node successor = findMin(root.right);
            root.val = successor.val;
            root.right = Delete(root.right, successor.val);
        }
        return root;
    }

    private static Node findMin(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    // Optional utility to print tree inorder
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}

class Node {
    int val;
    int depth; // currently unused
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
