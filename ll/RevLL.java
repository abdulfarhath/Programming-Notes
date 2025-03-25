package ll;

import ll.llops; // Importing llops to use its methods

public class RevLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        llops.insrt(head, 2);
        llops.insrt(head, 3);
        llops.insrt(head, 4);
        llops.insrt(head, 5);

        System.out.println("Original Linked List:");
        llops.disp(head);
        
        head = rev(head,head); // Reverse the linked list

        System.out.println("Reversed Linked List:");
        
        llops.disp(head.next);
    }

    static Node rev(Node head,Node temp) {
        if(head == null) return temp;
        if(head.next == null){
            temp.next = head;
            temp = temp.next;
            return null;
        }
        head.next = rev(head.next,temp);
        return head;
    }
}
