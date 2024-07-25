package dsa.data_structure.f_tree;

public class TreeTravsersalDFSWithRecursion {
	public static void main(String[] args) {
		System.out.println("DFS Tree Traversal :- ");
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
		
		preOrder(tree);
		inOrder(tree);
		postOrder(tree);
	}
	
	public static void preOrder(Tree tree) {
		System.out.print("Pre Order : ");
		tree.preOrder(tree.root);
		System.out.println();
	}
	
	public static void inOrder(Tree tree) {
		System.out.print("In  Order : ");
		tree.inOrder(tree.root);
		System.out.println();
	}

	public static void postOrder(Tree tree) {
		System.out.print("PostOrder : ");
		tree.postOrder(tree.root);	
		System.out.println();
	}
}
