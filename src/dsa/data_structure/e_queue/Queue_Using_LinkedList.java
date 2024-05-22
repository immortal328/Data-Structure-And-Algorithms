package dsa.data_structure.e_queue;

import dsa.a_models.Node;

public class Queue_Using_LinkedList {
	private Node head;
	private Node back;
	private int totalElementInQueue;
	private int queueSize;
	
	public Queue_Using_LinkedList(int size) {
		this.head = this.back = null;
		this.queueSize = size;
		this.totalElementInQueue = 0;
	}
	
	/**
	 * Method to add data in Queue
	 * */
	void enQueue(Node newNode) {
		Node temp = head;
		if(totalElementInQueue == queueSize) {
			System.out.println(String.format("Queue in Full... Can't add %d in Queue",newNode.data));						
		}else {
			System.out.println(String.format("Adding %d in Queue...", newNode.data));
			if(temp == null) {
				head = newNode;			
			}else {
				while(temp.next != null) {
					temp = temp.next;				
				}
				temp.next=newNode;
				back=newNode;			
			}
			totalElementInQueue++;	
		}
	}
	
	/**
	 * Method to remove data from Queue
	 * */
	void deQueeue() {
		Node temp = head;
		if(totalElementInQueue ==0) {
			System.out.println(String.format("Queue is Empty... There is Nothing to Remove"));
			head=back=null;
		}else {
			System.out.println(String.format("Removing %d from Queue...", head.data));
			head = temp.next;
			temp.next=null;
			temp =null;
		}
		totalElementInQueue--;		
	}
	
	/**
	 * 
	 * */
	void printQueue() {
		Node temp = head;
		if(totalElementInQueue == 0 || temp ==null) {
			System.out.println(String.format("Queue is Empty... There is nothing to print"));
		}else {
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}	
			System.out.println();
		}
	}

}
