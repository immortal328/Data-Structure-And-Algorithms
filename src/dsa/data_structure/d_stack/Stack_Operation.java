package dsa.data_structure.d_stack;

public class Stack_Operation {
	public static void main(String[] args) {
		try {
			Stack_Using_Array stackArr = new Stack_Using_Array();
			
			stackUsingArrayOperation(stackArr);
				
		}catch(Exception ex) {
			System.out.println(ex);			
		}

	}
	
	public static void stackUsingArrayOperation(Stack_Using_Array stack) throws Exception {
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
	
	public static void stackUsingLinkedListOperation(Stack_Using_Array stack) throws Exception {
		
	}

}
