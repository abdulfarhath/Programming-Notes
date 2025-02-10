import java.util.*;
//gfg

//wrong

class Solution {
	static int count = 0;
    public int sumK(Node root, int k) {
 		recursion(root,k,0);
 		return count;
    }
    static void recursion(Node root, int k, int sum){

    	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    	if(root == null) return;
    	if(root.left != null){
    		recursion(root.left,k,sum+root.data);
    	}
    	sum = 0;
    	if(root.right != null){
    		recursion(root.right,k,sum+root.data);
    	}

    }
}