import java.util.*;

public class sumtriangle{
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		recursion(arr,arr.length);
	}

	static void recursion(int[] arr, int n){
		if(n == 0) return;

		int brr[] = new int[n-1];
		for(int i = 0; i<n-1; i++){
			brr[i] = arr[i] + arr[i+1];
		}
		recursion(brr,n-1);
	
			System.out.println(Arrays.toString(arr));
	}
	
}
