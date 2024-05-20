package dsa.data_structure.c_linkedlist;

import dsa.a_models.DoubleNode;

public class DoublyLinkedList {
	private DoubleNode head;
	
	public DoublyLinkedList() {
		this.head = null;
	}
	
	void addNodeAtPosition(int position,DoubleNode node) {
		System.out.println("Adding Node"+node.data+" at index : "+position);
		int index =1;
		DoubleNode temp = head;
		if(position == index) {
			addNode(node);
		}else {
			while(index != position) {
				temp=temp.next;
				index++;				
			}
			temp.prev.next=node;
			node.next=temp;
			node.prev = temp.prev;
			temp.prev=node;
						
		}
	}
	
	void addNode(DoubleNode data) {
		DoubleNode temp = head;
		if(temp == null) {
			head = data;
		}else {
			while(temp.next != null) {
				temp= temp.next;				
			}
			temp.next=data;
			data.prev=temp;
		}		
	}
	
	void addAtStart(DoubleNode data) {
		System.out.println("Adding element at start");
		data.next=head;
		head.prev = data;
		head=data;
	}
	
	void removeNodeByData(int data) {
		System.out.println("removing Node by data : "+data);

		DoubleNode temp =head;
		if(head.data == data) {
			head = temp.next;
			temp.next.prev=null;
			temp.next=null;			
		}else {
			while(temp.data != data) {
				temp =temp.next;
			}
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			temp.next=null;temp.prev=null;
		}
		
	}
	
	void removeNodeAtPosition(int position) {
		System.out.println("removing Node at index : "+position);
		DoubleNode temp =head;
		int index =1;
		if(position == index) {
			head = temp.next;
			temp.next.prev=null;
			temp.next=null;			
		}else {
			while(index != position) {
				temp =temp.next;
				index++;
			}
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			temp.next=null;temp.prev=null;
		}
		
	
		
	}
	
	void printLinkedList() {
		DoubleNode temp = head;
		System.out.print(temp.prev+"=");
		while(temp.next != null) {
			System.out.print("["+temp.data+"]"+"=");
			temp = temp.next;
		}
		System.out.print("["+temp.data+"]"+"="+temp.next+"\n");
		
		System.out.print(temp.next+"=");
		while(temp.prev != null) {
			System.out.print("["+temp.data+"]"+"=");
			temp = temp.prev;
		}
		System.out.print("["+temp.data+"]"+"="+temp.prev+"\n\n");
	}
	

}
