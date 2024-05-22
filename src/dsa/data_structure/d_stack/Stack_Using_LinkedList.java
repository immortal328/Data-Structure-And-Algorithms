package dsa.data_structure.d_stack;

import dsa.a_models.Node;

public class Stack_Using_LinkedList {
	private Node head;
	private Node top;
	private int stackSize;
	private int totalElementInStack=0;
	
	public Stack_Using_LinkedList(int size) {
		head=top=null;
		stackSize=size;
	}
	
	/**
	 * Return the total element in stack
	 * */
	void getTotalElementInStack() {
		System.out.println("Total element in Stack : "+this.totalElementInStack);
	}
	
	/**
	 * Method to add data in stack
	 * */
	void push(Node node) {
		System.out.println(String.format("Adding %d in Stack", node.data));
		if(totalElementInStack == stackSize) {			
			System.out.println(String.format("Stack in Full... Can't add %d in Stack",node.data));			
		}else {
			if(head ==null) {
				head=top=node;				
			}else {
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;					
				}
				temp.next=node;
				top = node;				
			}
			totalElementInStack++;
		}
	}
	
	/**
	 * Method will print Top element of stack
	 * */
	void peek() {
		System.out.println("Top is : "+top.data);	
	}
	
	void pop() {
		Node temp=head;
		if(totalElementInStack ==0 || temp == null) {
			System.out.println("Cant perform pop operation, Satck is empty...");
		}else if(top == temp){
			System.out.println(String.format("Removing %d from Stack", temp.data));
			head=top=null;			
		}else {
			while(temp.next != top) {
				temp = temp.next;				
			}
			System.out.println(String.format("Removing %d from Stack", temp.next.data));
			temp.next = null;
			top = temp;
		}
		totalElementInStack--;
	}
	
	/**
	 * Method to print Stack
	 * */
	void printStack() {
		Node temp = head;
		if(totalElementInStack == 0 || head==null) {
			System.out.println("Stack is Empty... There is Nothing to Print");			
		}else {
			while(temp != null) {
				System.out.print(temp.data + " ");			
				temp = temp.next;
			}			
		}
		System.out.println();
	}	

}
