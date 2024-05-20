package dsa.data_structure.c_linkedlist;

import dsa.a_models.Node;

public class LinkedList_Operation {
	public static void main(String[] args) {
		
		try {
			int[] array = {1,2,3,4,5,6,7,8,9,10};
			LinkedList linkedlist = new LinkedList();
			CircularLinkedList circularLinkedList = new CircularLinkedList();
			
			//SinglyLinkedList
			//singlyLinkedListOperation(linkedlist,array);
			circularLinkedListOperation(circularLinkedList,array);			
		}catch(Exception ex) {
			System.out.println(ex);			
		}
		
		
	}
	
	//Operation perform on Circular LinkedList
	public static void circularLinkedListOperation(CircularLinkedList circularLisnkedList, int[] arr) throws Exception {
		for(int data : arr) {
			circularLisnkedList.addNode(new Node(data));
		}		
		circularLisnkedList.removeNode(5);
		circularLisnkedList.addNodeAtPosition(new Node(0),1);
		circularLisnkedList.addNodeAtPosition(new Node(-2),3);
		circularLisnkedList.addNodeAtPosition(new Node(-3),5);
		circularLisnkedList.printLinkedList(arr.length);
		circularLisnkedList.removeNode(11);
	}
	
	//Operation peforme on singlly LinkedLisy
	public static void singlyLinkedListOperation(LinkedList linkedlist, int[] array) throws Exception {
		for(int data : array) {
			linkedlist.addNode(new Node(data));
		}
		
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

	}
	
}
