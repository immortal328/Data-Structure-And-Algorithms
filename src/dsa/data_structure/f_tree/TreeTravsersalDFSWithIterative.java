package dsa.data_structure.f_tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TreeTravsersalDFSWithIterative {
	public static void main(String[] args) {
		System.out.println("DFS Tree Traversal using Iterative :");
		/**
		 * 				5
		 * 			   / \					
		 *            /   \					
		 *           /     \
		 * 			3	    7
		 *         / \     / \
		 * 		  2   4   6	  8
		 * 
		 * PreOrder  : 5 3 2 4 7 6 8
		 * InOrder   : 2 3 4 5 6 7 8
		 * PostOrder : 2 4 3 6 8 7 5
		 * 
		 * */
		operations();		
	}
	
	public static void operations() {
		Tree tree = new Tree();
		tree.insert(new TreeNode(5));
		tree.insert(new TreeNode(3));
		tree.insert(new TreeNode(7));
		tree.insert(new TreeNode(2));
		tree.insert(new TreeNode(4));
		tree.insert(new TreeNode(6));
		tree.insert(new TreeNode(8));
		
		System.out.println(preOrder(tree));
		System.out.println(inOrder(tree));
		System.out.println(postOrder(tree));
	}
	
	public static List<Integer> preOrder(Tree tree) {
		// Root Left Right
		System.out.print("PreOrder  : ");
		List<Integer> preOrder = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.add(tree.root);	
		
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			preOrder.add(node.data);
			if(node.right != null)
				stack.add(node.right);
			if(node.left != null)
				stack.add(node.left);
		}
		return preOrder;
	}
	
	public static List<Integer> inOrder(Tree tree) {
		//Left Root Right
		System.out.print("InOrder   : ");
		List<Integer> inOrder = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = tree.root;
		
		while(true) {
			if(node != null) {
				stack.push(node);
				node = node.left;				
			}else {
				if(stack.isEmpty()) {
					break;					
				}
				node = stack.pop();
				inOrder.add(node.data);
				node = node.right;
			}
		}
		return inOrder;
	}
	
	public static List<Integer> postOrder(Tree tree){
		//Left Right Root
		System.out.print("PostOrder : ");
		List<Integer> postOrder = new LinkedList<>();
		Stack<TreeNode> stack1 = new Stack<>();
		Stack<TreeNode> stack2 = new Stack<>();
		TreeNode node = tree.root;
		
		stack1.push(node);		
		if(node == null) return postOrder;
		
		while(!stack1.isEmpty()) {
			node = stack1.pop();
			stack2.push(node);
			if(node.left != null) stack1.push(node.left);
			if(node.right != null) stack1.push(node.right);
		}
		
		while(!stack2.isEmpty()) {
			postOrder.add(stack2.pop().data);			
		}		
		return postOrder;		
	}
	
	
}
