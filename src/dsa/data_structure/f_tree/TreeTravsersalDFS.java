package dsa.data_structure.f_tree;

public class TreeTravsersalDFS {
	public static void main(String[] args) {
		System.out.println("DFS Tree Traversal :- ");
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
		
		printPreOrder(tree);
		printInOrder(tree);
		printPostOrder(tree);
	}
	
	public static void printPreOrder(Tree tree) {
		System.out.print("Pre Order : ");
		tree.preOrder(tree.root);
		System.out.println();
	}
	
	public static void printInOrder(Tree tree) {
		System.out.print("In  Order : ");
		tree.inOrder(tree.root);
		System.out.println();
	}

	public static void printPostOrder(Tree tree) {
		System.out.print("PostOrder : ");
		tree.postOrder(tree.root);	
		System.out.println();
	}
}
