class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        return recursion(Node root, new ArrayList<Integer>());
    }
    static ArrayList<Integer> recursion(Node root, ArrayList<Integer> list){
        if(root == null) return list;
        ArrayList<Integer> left = recursion(root.left,list));
        left.add(root.data);
        ArrayList<Integer> right = recursion(root.right,list);
        return left.addAll(right);
    
}