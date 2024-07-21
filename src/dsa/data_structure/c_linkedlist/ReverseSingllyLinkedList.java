package dsa.data_structure.c_linkedlist;

import dsa.a_models.Node;

public class ReverseSingllyLinkedList {

	public static void main(String[] args) {
		reserseSingllyLinkedList();
	}
	
	public static void reserseSingllyLinkedList() {
		LinkedList linkedList = new LinkedList();
		for(int i=1;i<6;i++) {
			linkedList.addNode(new Node(i));			
		}
		System.out.println("LinkedList before Reversing...");
		linkedList.printLinkedList(linkedList.size());
		System.out.println("LinkedList After Reversing...");
		reverseAndPrintLinkedList(linkedList);
		
		
	}
	
	public static void reverseAndPrintLinkedList(LinkedList ll) {
		Node prev = null;
		Node next = null;
		Node curr = ll.getHead();
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		ll.setHead(prev);
		ll.printLinkedList(ll.size());
	}

}
