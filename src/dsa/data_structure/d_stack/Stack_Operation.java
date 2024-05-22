package dsa.data_structure.d_stack;

import dsa.a_models.Node;

public class Stack_Operation {
	public static void main(String[] args) {
		try {			
			//stackUsingArrayOperation();
			stackUsingLinkedListOperation();
		}catch(Exception ex) {
			System.out.println(ex);			
		}

	}
	
	/**
	 * Performing All Stack operation, Which implemented using Array
	 * */
	public static void stackUsingArrayOperation() throws Exception {
		Stack_Using_Array stack = new Stack_Using_Array(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.peek();
		stack.pop();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);		
	}
	
	/**
	 * Performing All Stack operation, Which implemented using LinkedList
	 * */
	public static void stackUsingLinkedListOperation() throws Exception {
		Stack_Using_LinkedList stack = new Stack_Using_LinkedList(5);
		stack.push(new Node(1));
		stack.push(new Node(2));
		stack.peek();
		stack.getTotalElementInStack();
		stack.push(new Node(3));
		stack.push(new Node(4));
		stack.peek();
		stack.push(new Node(5));
		stack.printStack();
		stack.push(new Node(6));
		stack.pop();
		stack.pop();
		stack.printStack();
		stack.peek();
		stack.push(new Node(7));
		stack.printStack();
		stack.peek();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printStack();
		stack.pop();
		
		
		
		
	}

}
