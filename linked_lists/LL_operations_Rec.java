import java.util.*;

class Node{
	int val;
	Node next;
	Node(int val){
		this.val = val;
	}
	Node(int val, Node next){
		this.val = val;
		this.next = next;
	}
}

public class LL_operations_Rec{
	public static void main(String[] args) {
		Node head = new Node(2);
		insertionRec(head,3);
		insertionRec(head,4);
		insertionRec(head,5);
		insertionRec(head,6);
		insertionRec(head,7);
		insertionRec(head,8);
		deletionRec(head,3);
		insertionIdxRec(head,5,100);
		displayRec(head);
	}
	static Node insertionRec(Node head, int val){
		if(head.next == null){
			Node node = new Node(val);
			head.next = node;
			return head;
		}
		head.next = insertionRec(head.next,val);
		return head;
	}
	static Node deletionRec(Node head, int val){
		if(head == null) return null;
		if(head.val == val) return head.next;
		head.next = deletionRec(head.next,val);
		return head;
	}
	static Node insertionIdxRec(Node head, int idx, int val) {
	    if (idx == 0) {
	        return new Node(val, head);
	    }
	    if (head == null) { // Handle out-of-bounds index case
	        return null;
	    }
	    head.next = insertionIdxRec(head.next, idx - 1, val);
	    return head;
	}
	static void displayRec(Node head){
		if(head == null) return;
		else{
			System.out.println(head.val);
			displayRec(head.next);
		}
	}
}