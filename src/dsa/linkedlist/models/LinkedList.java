package dsa.linkedlist.models;

public class LinkedList {
	public Node root = null;
	
	public LinkedList() {}
	public LinkedList(Node root) {super();this.root = root;}
	
	public void addNode(Node data) {		
		if(root == null) {
			root = data;			
		}else {
			Node temp = root;
			while(temp.next!= null){
				temp=temp.next;				
			}
			temp.next=data;
		}		
	}
	
	public void addNodeAtPosition(Node data, int position) {
		
		
	}

}
