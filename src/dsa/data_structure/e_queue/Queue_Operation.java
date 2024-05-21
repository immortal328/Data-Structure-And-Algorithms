package dsa.data_structure.e_queue;

public class Queue_Operation {

	public static void main(String[] args) {
		try {
			queueUsingArrayOperations();			
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

}
