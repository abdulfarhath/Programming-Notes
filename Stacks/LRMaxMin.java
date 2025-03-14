import java.util.*;

public class LRMaxMin{
	public static void main(String[] args) {
		int[] arr = {5,1,3,4,8};
		int n = arr.length;
		LMax(arr,n);
	}

	static void LMax(int[] a,int n){
		int res[] = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i<n; i++){
			if(st.isEmpty()){
				st.push(x);
				res[i] = -1;
			}else{
				if(st.peek() > a[i]){
					
				}
			}
		}
	}


}

