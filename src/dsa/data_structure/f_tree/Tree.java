package dsa.data_structure.f_tree;

public class Tree {
	public TreeNode root;

	public Tree() {
		root = null;
	}

	/**
	 * Method to add Node In Tree.
	 * 
	 * @param TreeNode
	 */
	public void insert(TreeNode node) {
		if (root == null) {
			root = node;
		} else {
			TreeNode current = root;
			TreeNode parent = null;

			while (true) {
				parent = current;
				if (node.data < parent.data) {
					current = current.left;
					if (current == null) {
						parent.left = node;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = node;
						return;
					}
				}
			}
		}
	}

	/**
	 * This Method to print PreOrder of Tree
	 * @param TreeNode root
	 */
	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	/**
	 * This Method to print InOrder of Tree
	 * @param TreeNode root
	 */
	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	/**
	 * This Method to print PostOrder of Tree
	 * @param TreeNode root
	 */
	public void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
}
