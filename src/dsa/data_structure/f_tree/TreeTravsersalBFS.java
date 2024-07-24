package dsa.data_structure.f_tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTravsersalBFS {
	public static void main(String[] args) {
		System.out.println("BFS Tree Traversal :- ");
		operations();	
		
		/**
		 * 				5
		 * 			   / \
		 *            /   \
		 *           /     \
		 * 			3	    7
		 *         / \     / \
		 * 		  2   4   6	  8
		 * 
		 * OUTPUT : 5 3 7 2 4 6 8
		 * 
		 * */
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
		
		bfsTraversal(tree);
		
		
	}
	
	public static void bfsTraversal(Tree tree) {		
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(tree.root != null) {
			queue.add(tree.root);
			while(!queue.isEmpty()) {
				TreeNode current = queue.poll();
				System.out.print(current.data+" ");
				
				if(current.left != null) {
					queue.add(current.left);										
				}
				if(current.right != null) {
					queue.add(current.right);						
				}
			}
		}else {
			System.out.println("Tree Dont have data..");
		}		
	}

}
