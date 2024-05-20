package dsa.data_structure.c_linkedlist;

import dsa.a_models.Node;

public class CircularLinkedList {
	private Node head;
	
	public CircularLinkedList() {
		head=null;
	}
	
	
	public void addNode(Node data) {
		if(head == null) {
			head=data;
			head.next=head;
		}else {
			Node temp = head;
			while(temp.next != head) {
				temp = temp.next;				
			}
			temp.next=data;
			data.next=head;
		}
	}
	
	/**
	 * Removes Node From LinkedList
	 * */
	public void removeNode(int targetData) throws Exception {
		Node temp = head;
		if(head.data == targetData) {
			head = head.next;
			temp.next = null;
		}else {
			while(temp.next != head && temp.next.data != targetData) {
				temp = temp.next;				
			}
			if(temp.next == head) {
				throw new Exception("Target Node Not Found in LinkedList");				
			}						
			Node targetNode = temp.next;
			temp.next = targetNode.next;
			targetNode.next = null;
		}
	}
	
	
	private void addNodeAtStart(Node data) {
		Node temp = head;
		while(temp.next != head) {
			temp= temp.next;
		}
		temp.next =data;
		data.next = head;
		head = data;		
	}
	
	/**
	 * @param Node data, position
	 * To add Node at specified position
	 * @throws Exception 
	 * 
	 * */
	public void addNodeAtPosition(Node data, int position) throws Exception {
		Node temp = head;
		int index = 1;
		if(position == index) {
			addNodeAtStart(data);			
		}else {
			while(index != position-1) {
				if(temp.next != head) {
					temp = temp.next;
				}else {
					throw new Exception("LinkedList size : "+size()+",which less than Position:"+position+", So we cant add this Node");
				}				
				index++;
			}
			data.next=temp.next;
			temp.next=data;
		}		
	}
	
	/**
	 * This method return size of linkedlist
	 * */
	public int size() {
		int size=1;
		Node temp = head;
		if(head == null)
			return 0;
		
		while(temp.next != null) {
			temp = temp.next;
			size++;			
		}
		return size;
	}
	
	/**
	 * Method to print inkedList
	 * */
	public void printLinkedList(int size) {
		Node temp = head;		
		while(temp.next != head) {
			System.out.print("["+temp.data+"]-->");
			temp = temp.next;
		}
		System.out.print("["+temp.data+"]"+" Again (loop) --> "+"["+temp.next.data+"]"+" | Size : "+size+" \n");
	}	

}
