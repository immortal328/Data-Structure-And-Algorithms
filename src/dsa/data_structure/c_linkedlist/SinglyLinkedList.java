package dsa.data_structure.c_linkedlist;

import dsa.a_models.LinkedList;
import dsa.a_models.Node;

public class SinglyLinkedList {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		LinkedList linkedlist = new LinkedList();		
		for(int data : array) {
			linkedlist.addNode(new Node(data));
		}
		try {

		// Adding Node at End
		linkedlist.addNode(new Node(11));
		linkedlist.printLinkedList(linkedlist.size());
		
		//Adding Node at Given Position
		linkedlist.addNodeAtPosition(new Node(-2), 3);
		linkedlist.addNodeAtPosition(new Node(-11), 11);
		linkedlist.printLinkedList(linkedlist.size());
		
		//Throwing Exception if given position is more than LinkedList size
		//linkedlist.addNodeAtPosition(new Node(-15),15);
		
		//Removing Node 1
		linkedlist.removeNode(1);
		linkedlist.printLinkedList(linkedlist.size());
		
		//Removing Node 10
		linkedlist.removeNode(10);
		linkedlist.printLinkedList(linkedlist.size());
		
		//Removing Node -11
		linkedlist.removeNode(-11);
		linkedlist.printLinkedList(linkedlist.size());
		
		//Removing Node -12, Will throw Exception boz Node 12 Non present in linkedList
		linkedlist.removeNode(-11);
		}catch(Exception ex) {
			System.out.println(ex);			
		}

	}

}
