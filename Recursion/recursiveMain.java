import java.util.*;

class recursiveMain{
	static int count = 0;
	public static void main(String[] args) {
		if(count == 10){
			return;
		}
		count++;
		System.out.println(count);
		main(args);
	}
}