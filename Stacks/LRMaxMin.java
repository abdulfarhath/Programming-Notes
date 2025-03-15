import java.util.*;

public class LRMaxMin{
	public static void main(String[] args) {
		int[] arr = {5,1,3,4,8};
		int n = arr.length;
		LMax(arr,n);
		RMax(arr,n);
		LMin(arr,n);
	}

	static void LMax(int[] a, int n) {
	    int res[] = new int[n];
	    Stack<Integer> st = new Stack<>();
	    for (int i = 0; i < n; i++) {
	        while (!st.isEmpty() && st.peek() <= a[i]) {
	            st.pop();
	        }
	        res[i] = st.isEmpty() ? -1 : st.peek();
	        st.push(a[i]); 
	    }
	    System.out.println(Arrays.toString(res));
	}

	static void RMax(int[] a, int n) {
	    int res[] = new int[n];
	    Stack<Integer> st = new Stack<>();
	    for (int i = n - 1; i >= 0; i--) { //
	        while (!st.isEmpty() && st.peek() <= a[i]) {
	            st.pop();
	        }
	        res[i] = st.isEmpty() ? -1 : st.peek();
	        st.push(a[i]); 
	    }
	    System.out.println(Arrays.toString(res));
	}


	static void LMin(int[] a,int n){
		int res[] = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i<n; i++){
			if(st.isEmpty()){
				st.push(a[i]);
				res[i] = -1;
			}else{
				while(!st.isEmpty() && st.peek() >= a[i]){
					st.pop();
				}
				if(!st.isEmpty()){
					res[i] = st.peek();
					st.push(a[i]);
				}else res[i] = -1;
			}
		}
		System.out.println(Arrays.toString(res));
	}



}

