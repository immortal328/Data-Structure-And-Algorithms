package dsa.data_structure.e_queue;

import dsa.a_models.Node;

public class Queue_Operation {

	public static void main(String[] args) {
		try {
			//queueUsingArrayOperations();
			queueUsingLinkedListOperations();
		}catch(Exception ex) {
			System.out.println(ex);			
		}		
	}
	
	static void queueUsingArrayOperations() throws Exception {
		Queue_Using_Array queue = new Queue_Using_Array(5);
		queue.addInQueue(1);
		queue.printQueue();
		queue.addInQueue(2);
		queue.addInQueue(3);
		queue.addInQueue(4);
		queue.addInQueue(5);
		queue.printQueue();
		queue.addInQueue(1);
		queue. removeFromQueue();
		queue.printQueue();
		queue. removeFromQueue();
		queue.printQueue();
		queue.addInQueue(6);
		queue.addInQueue(7);
		queue.printQueue();
		queue. removeFromQueue();
		queue. removeFromQueue();
		queue. removeFromQueue();
		queue. removeFromQueue();
		queue. removeFromQueue();
		queue.printQueue();
		
		
	}
	
	static void queueUsingLinkedListOperations() {
		Queue_Using_LinkedList queue = new  Queue_Using_LinkedList(5);
		
		queue.enQueue(new Node(11));
		queue.enQueue(new Node(12));
		queue.enQueue(new Node(13));
		queue.enQueue(new Node(14));
		queue.enQueue(new Node(15));
		queue.printQueue();
		queue.enQueue(new Node(16));
		queue.deQueeue();
		queue.deQueeue();
		queue.printQueue();
		queue.enQueue(new Node(17));
		queue.printQueue();
		queue.deQueeue();
		queue.deQueeue();
		queue.deQueeue();
		queue.deQueeue();
		queue.printQueue();
		queue.deQueeue();
		queue.enQueue(new Node(21));
		queue.enQueue(new Node(22));
		queue.enQueue(new Node(23));
		queue.printQueue();
		
		
	}

}
