import java.util.*;

public class LRMaxMin{
	public static void main(String[] args) {
		int[] arr = {5,1,3,4,8,1};
		System.out.println("arrr : " + Arrays.toString(arr));
		int n = arr.length;
		LMax(arr,n);
		RMax(arr,n);
		LMin(arr,n);
		RMin(arr,n);
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
	    System.out.println("lmax : " + Arrays.toString(res));
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
	    System.out.println("rmax : " + Arrays.toString(res));
	}


	static void LMin(int[] a, int n) {
	    int res[] = new int[n];
	    Stack<Integer> st = new Stack<>();
	    for (int i = 0; i < n; i++) {
	        while (!st.isEmpty() && st.peek() >= a[i]) {
	            st.pop();
	        }
	        res[i] = st.isEmpty() ? -1 : st.peek();
	        st.push(a[i]); 
	    }
	    System.out.println("lmin : " + Arrays.toString(res));
	}

	static void RMin(int[] a, int n) {
	    int res[] = new int[n];
	    Stack<Integer> st = new Stack<>();
	    for (int i = n - 1; i >= 0; i--) { //
	        while (!st.isEmpty() && st.peek() >= a[i]) {
	            st.pop();
	        }
	        res[i] = st.isEmpty() ? -1 : st.peek();
	        st.push(a[i]); 
	    }
	    System.out.println("rmin : " + Arrays.toString(res));
	}


}

