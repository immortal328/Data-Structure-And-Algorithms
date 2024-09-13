package dsa.data_structure.f_tree;

public class TreeMaxDepth {

	public static void main(String[] args) {
		/**
		 * 				5
		 * 			   / \
		 *            /   \
		 *           /     \
		 * 			3	    7
		 *         / \     / \
		 * 		  2   4   6	  8
		 * 
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
		tree.insert(new TreeNode(1));
		
		System.out.println("Maximum Height of tree is : "+maxDepth(tree.root));
	}
	
	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;			
		}
		
		int lh = maxDepth(root.left);
		int rh = maxDepth(root.right);
		
		return 1+ Math.max(lh, rh);		
	}

}
