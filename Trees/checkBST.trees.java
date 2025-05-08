class Solution {
    boolean isBST(Node root) {
        return isReallyBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    static boolean isReallyBST(Node root, int min , int max){
        if(root == null) return true;
        if(root.data <= min || root.data >= max) return false;
        return isReallyBST(root.left, min, root.data) && isReallyBST(root.right,root.data,max);
    }
}