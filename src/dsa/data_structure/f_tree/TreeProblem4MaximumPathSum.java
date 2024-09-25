package dsa.data_structure.f_tree;

public class TreeProblem4MaximumPathSum {
	
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
		TreeNode a = new TreeNode(1); TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3); TreeNode d = new TreeNode(6);
		TreeNode e = new TreeNode(7); TreeNode f = new TreeNode(8);
		TreeNode root = new TreeNode(5);
		b.left = a; b.right =c;
		e.left = d; e.right =f;
		root.left=b;root.right=e;
		System.out.println("Maximum Path of Tree : "+ getMaximumPathOfTree(root));
		
		
		a = new TreeNode(1);  b = new TreeNode(2);
		c = new TreeNode(3);  d = new TreeNode(-6);
		e = new TreeNode(7);  f = new TreeNode(-8);
		root = new TreeNode(5);
		 
		b.left = a; b.right =c;
		e.left = d; e.right =f;
		root.left=b;root.right=e;
		System.out.println("Maximum Path of Tree : "+ getMaximumPathOfTree(root));
	}
	
	public static int getMaximumPathOfTree(TreeNode root) {
		int [] maximum = new int[1];
		maxPath(root, maximum);
		return maximum[0];
	}
	
	public static int maxPath(TreeNode root, int[] maximum) {
		if(root == null) return 0;
		
		int leftSum = maxPath(root.left, maximum);
		leftSum = leftSum > 0 ? leftSum : 0;
		int rightSum = maxPath(root.right, maximum);
		rightSum = rightSum > 0 ? rightSum : 0;
		
		maximum[0] = Math.max(maximum[0], root.data + leftSum + rightSum);
		return root.data + Math.max(leftSum, rightSum);
	}
	
}
