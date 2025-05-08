import java.util.*;

class MinHeap extends PriorityQueue<Integer>{}
class MaxHeap{
	Queue<Integer> pq = new PriorityQueue<>();
	void add(int x){ pq.add(-x);}
	int poll(){ return -pq.poll();}
	in size() { return pq.size();}
	int peek() {return -pq.peek();}
}

public class crazy_heaps_impl{
	public static void main(String[] args) {
		MinHeap minh = new MinHeap();
		MaxHeap maxh = new MinHeap();
		//use the heaps as required
	}
}