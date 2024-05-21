package dsa.data_structure.e_queue;

public class Queue_Using_Array {
	private int[] arr;
	private int front,back,size;
	
	public Queue_Using_Array(int queueSize) {
		arr = new int[queueSize];
		front=back=0;size=queueSize;
	}
	
	void addInQueue(int data) {
		System.out.println("Adding in queue : "+data);
		if(back == size) {
			System.out.println("Queue is Full... Cant add element : "+data);
		}else {
			arr[back++]=data;
		}		
	}
	
	void removeFromQueue() {
		System.out.println("Removing 1st element : "+arr[front]);
		if(front == back) {
			System.out.println("Queue is Empty... there is Nothing in Queue to remove");		
		}else {
			for(int i=0;i<back-1;i++) {
				arr[i] = arr[i+1];				
			}
			back--;
		}		
	}
	
	void printQueue(){
		if(front == back) {
			System.out.println("Queue is Empty... Cant print Queue");			
		}else {
			for(int i=0;i<back;i++) {
				System.out.print(arr[i]+" ");			
			}			
		}
		System.out.println();
	}	

}
