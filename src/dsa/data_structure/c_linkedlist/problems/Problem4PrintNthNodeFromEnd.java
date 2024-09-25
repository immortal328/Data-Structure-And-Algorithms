package dsa.data_structure.c_linkedlist.problems;

import dsa.a_models.Node;
import dsa.data_structure.c_linkedlist.LinkedList;

public class Problem4PrintNthNodeFromEnd {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addNode(new Node(1));
		ll.addNode(new Node(2));
		ll.addNode(new Node(3));
		ll.addNode(new Node(4));
		ll.addNode(new Node(5));
		ll.addNode(new Node(6));
		ll.addNode(new Node(7));
		ll.addNode(new Node(8));
		
		printNthNodeFromEnd(ll,2);
		printNthNodeFromEnd(ll,4);
		printNthNodeFromEnd(ll,6);

	}
	
	public static void printNthNodeFromEnd(LinkedList ll, int postitionFromEnd) {
		Node temp = ll.getHead();
		int count = 1;
		Node nth = ll.getHead();
		
		while(temp.next != null) {
			if(count >= postitionFromEnd) {
				temp = temp.next;
				nth = nth.next;
			}else {
				temp = temp.next;				
			}			
			count++;
		}
		System.out.println(postitionFromEnd+" Node from end is :"+nth.data);		
	}

}
