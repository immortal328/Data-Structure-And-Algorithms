package dsa.a_models;

public class LinkedList {
	private Node head = null;
	
	/**
	 *This Method always add Node at the End
	 *@param Node data
	 * */
	public void addNode(Node data) {		
		if(head == null) {
			head = data;			
		}else {
			Node temp = head;
			while(temp.next!= null){
				temp=temp.next;				
			}
			temp.next=data;
		}		
	}
	
	public void removeNode(int targetData) throws Exception {
		Node temp = head;
		if(head.data == targetData) {
			head = head.next;
			temp.next = null;
		}else {
			while(temp.next != null && temp.next.data != targetData) {
				temp = temp.next;				
			}
			if(temp.next == null) {
				throw new Exception("Target Node Not Found in LinkedList");				
			}						
			Node targetNode = temp.next;
			temp.next = targetNode.next;
			targetNode.next = null;
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
				if(temp.next != null) {
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
	 * @param Node data
	 * To Add Node at Start*/
	private void addNodeAtStart(Node data) {
		data.next = head;
		head = data;		
	}
	
	/**
	 * Method to print inkedList
	 * */
	public void printLinkedList(int size) {
		Node temp = head;		
		while(temp != null) {
			System.out.print("["+temp.data+"]-->");
			temp = temp.next;
		}
		System.out.print(temp+" | Size : "+size+" \n");
	}

}
