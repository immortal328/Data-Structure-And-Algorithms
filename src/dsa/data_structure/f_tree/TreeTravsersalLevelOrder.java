package dsa.data_structure.f_tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeTravsersalLevelOrder {

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

	private static void operations() {
		System.out.println("Level Order Traversal :");
		Tree tree = new Tree();
		tree.insert(new TreeNode(5));
		tree.insert(new TreeNode(3));
		tree.insert(new TreeNode(7));
		tree.insert(new TreeNode(2));
		tree.insert(new TreeNode(4));
		tree.insert(new TreeNode(6));
		tree.insert(new TreeNode(8));
		List<List<Integer>> levelOrder = levelOrderTraversal(tree);
		System.out.println(levelOrder.toString());
		
		
	}
	
	public static List<List<Integer>> levelOrderTraversal(Tree tree) {
		List<List<Integer>> levelOrder = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(tree.root);
		
		while(!queue.isEmpty()) {
			List<Integer> order = new LinkedList<>();
			int size = queue.size();
			for(int i=0;i<size;i++) {
				if(queue.peek().left != null){queue.add(queue.peek().left);}
				if(queue.peek().right != null){queue.add(queue.peek().right);}
				order.add(queue.poll().data);				
			}
			levelOrder.add(order);			
		}		
		return levelOrder;	
	}

}
