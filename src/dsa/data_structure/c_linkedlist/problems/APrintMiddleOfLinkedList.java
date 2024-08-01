package dsa.data_structure.c_linkedlist.problems;

import dsa.a_models.Node;
import dsa.data_structure.c_linkedlist.LinkedList;

public class APrintMiddleOfLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addNode(new Node(1));
		ll.addNode(new Node(2));
		ll.addNode(new Node(3));
		ll.addNode(new Node(4));
		ll.addNode(new Node(5));
		printMiddleOfLinkedList(ll);
		ll.addNode(new Node(6));
		printMiddleOfLinkedList(ll);

	}
	
	
	public static void printMiddleOfLinkedList(LinkedList linkedlist) {
		Node slow = linkedlist.getHead();
		Node fast = linkedlist.getHead();
		
		if(slow == null) {
			System.out.println("LinkedList is Empty...");			
		}else {
			while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		System.out.println("Middle Node is "+ slow + "value : "+slow.data);	
	}

}
