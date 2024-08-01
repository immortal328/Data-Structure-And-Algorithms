package dsa.data_structure.c_linkedlist.problems;

import dsa.a_models.DoubleNode;
import dsa.data_structure.c_linkedlist.DoublyLinkedList;

public class ReverseDoubllyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addNode(new DoubleNode(1));
		dll.addNode(new DoubleNode(2));
		dll.addNode(new DoubleNode(3));
		dll.addNode(new DoubleNode(4));
		dll.addNode(new DoubleNode(5));
		System.out.println("Printing doublly linkedlist befor reversing");
		dll.printLinkedList();
		System.out.println("Printing doublly linkedlist after reversing");
		reverseDouballyLinkedList(dll);
	}
	
	public static void reverseDouballyLinkedList(DoublyLinkedList dll) {
		DoubleNode prev= null;
		DoubleNode next = null;
		DoubleNode curr =dll.getHead();
		
		while(curr != null) {
			//storing next node 
			next = curr.next;
			
			//changing current node next and previous
			curr.next = prev;
			curr.prev = next;
			
			//updating previous
			prev = curr;
			//Updating current to next node
			curr = next;
		}
		dll.setHead(prev);
		
		dll.printLinkedList();
	}

}
