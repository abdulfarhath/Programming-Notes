package ll;

import java.util.*;

public class llops {
	public static void main(String[] args) {
		Node head = new Node(2);
		insrt(head, 3);
		insrt(head, 4);
		insrt(head, 5);
		insrt(head, 6);
		insrt(head, 7);
		insrt(head, 8);
		del(head, 3);
		insIdx(head, 5, 100);
		disp(head);
	}

	static Node insrt(Node head, int val) {
		if (head.next == null) return head.next = new Node(val);
		head.next = insrt(head.next, val);
		return head;
	}

	static Node del(Node head, int val) {
		if (head == null) return null;
		if (head.val == val) return head.next;
		head.next = del(head.next, val);
		return head;
	}

	static Node insIdx(Node head, int idx, int val) {
		if (idx == 0) return new Node(val, head);
		if (head == null) return null;
		head.next = insIdx(head.next, idx - 1, val);
		return head;
	}

	static void disp(Node head) {
		if (head == null) return;
		System.out.println(head.val);
		disp(head.next);
	}
}
