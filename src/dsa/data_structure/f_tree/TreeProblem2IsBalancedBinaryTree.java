package dsa.data_structure.f_tree;

public class TreeProblem2IsBalancedBinaryTree {

	public static void main(String[] args) {
		/**
		 * 				5
		 * 			   / \
		 *            /   \
		 *           /     \
		 * 			2	    7
		 *         / \     / \
		 * 		  1   3   6	  8
		 * */
		TreeNode a = new TreeNode(1); TreeNode b = new TreeNode(2); TreeNode c = new TreeNode(3);
		b.left = a; b.right = c;
		
//		TreeNode x = new TreeNode(1);
//		TreeNode y = new TreeNode(1);
//		x.left =y;
//		a.left=x;
		
		
		TreeNode d = new TreeNode(6);TreeNode e = new TreeNode(7);TreeNode f = new TreeNode(8);
		e.left = d; e.right=f;
		
		TreeNode g = new TreeNode(5);
		g.left=b;g.right=e;
		
		System.out.println("Give Tree is Balanced Binary Tree : "+ isBalancedBinaryTree(g));
		
		
	}
	
	public static boolean isBalancedBinaryTree(TreeNode root) {		
		return getHeight(root) != -1;	
	}
	
	public static int getHeight(TreeNode root) {
		
		if(root == null)
			return 0;
		
		int leftHeight = getHeight(root.left);
		if(leftHeight == -1) return -1;
		
		int rightHeight = getHeight(root.right);
		if(rightHeight == -1) return -1;
		
		if(Math.abs(rightHeight-leftHeight) >1)	return -1;
		return	1+Math.max(leftHeight, rightHeight);
	}

}
