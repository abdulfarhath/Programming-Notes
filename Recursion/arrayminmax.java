import java.util.*;

class arrayminmax{
	public static void main(String[] args) {
		System.out.println(recursion(new int[]{1,2,10,3,4,5},5));
	}
	static int recursion(int[] arr, int n){
		if(n == 0){
			return arr[0];
		}
		return Math.max(recursion(arr,n-1),arr[n]);
	}
}