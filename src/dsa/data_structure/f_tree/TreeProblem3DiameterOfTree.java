package dsa.data_structure.f_tree;

public class TreeProblem3DiameterOfTree {
	
	static int diameter=0;

	public static void main(String[] args) {
		System.out.println("The Diameter of Tree is : "+ getBinaryTreeDiameter());
	}
	 public static int getBinaryTreeDiameter() {		 
		TreeNode a = new TreeNode(1); 
		TreeNode b = new TreeNode(2); 
		TreeNode c = new TreeNode(3);
			
		b.left = a; b.right = c;
		a.left = new TreeNode(4);
		//c.right = new TreeNode(5);
		 
		int[] diameter = new int[1];
		getDiameter(b, diameter);
		
		return diameter[0];	
		
	 }
	
	public static int getDiameter(TreeNode root, int[] diameter) {
		if(root == null) return 0;
		int lh = getDiameter(root.left, diameter);
		int rh = getDiameter(root.right, diameter);
		diameter[0] = Math.max(diameter[0], rh+lh);
		return 1 + Math.max(lh, rh);
	}
	

}
