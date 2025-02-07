import java.util.*;
public class maze{
	public static void main(String[] args) {
		System.out.println(recursion("", 3,3));
	}
	static ArrayList<String> recursion(String sb,int r , int c){
		if(r == 1 && c == 1){
			ArrayList<String> list = new ArrayList<>();
			list.add(sb);
			return list;
		}
		ArrayList<String> left = new ArrayList<>(),right = new ArrayList<>(),diag = new ArrayList<>();
		if(r>1 && c>1){
			diag = recursion(sb+"D",r-1,c-1);
		}
		if(r > 1){
			left = recursion(sb+"r",r-1,c);
		}
		if(c > 1){
			right = recursion(sb+"d",r,c-1);
		}
		left.addAll(right);
		left.addAll(diag);
		return left;
	}
}