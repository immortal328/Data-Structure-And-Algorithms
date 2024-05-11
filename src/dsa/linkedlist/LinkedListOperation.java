package dsa.linkedlist;

import dsa.linkedlist.models.LinkedList;
import dsa.linkedlist.models.Node;

public class LinkedListOperation {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		LinkedList linkedlist = new LinkedList();		
		for(int data : array) {
			linkedlist.addNode(new Node(data,null));
		}
		linkedlist.addNode(new Node(11,null));
		printLinkedList(linkedlist);	
	}
	
	public static void printLinkedList(LinkedList linkedlist) {
		Node temp = linkedlist.root;		
		while(temp != null) {
			System.out.print("["+temp.data+"]-->");
			temp = temp.next;
		}
		System.out.print(temp);
	}

}
