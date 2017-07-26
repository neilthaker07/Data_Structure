package narsimKar;

class Node8 
{
	Node8(int data) 
	{
		this.data = data;
	}
	int data;
	Node8 left;
	Node8 right;
}

public class BinaryTreeLeastCommonAncestor 
{
	// Root of the Binary Tree
	Node8 root;

	Node8 findLCA(int n1, int n2) 
	{
		return findLCA(root, n1, n2);
	}

	Node8 findLCA(Node8 node, int n1, int n2)
	{
		if (node == null)
			return null;

		if (node.data == n1 || node.data == n2)
			return node;

		Node8 left_lca = findLCA(node.left, n1, n2);
		Node8 right_lca = findLCA(node.right, n1, n2);

		if (left_lca != null && right_lca != null)
			return node;

		return (left_lca != null) ? left_lca : right_lca;
	}

	public static void main(String args[])
	{
		BinaryTreeLeastCommonAncestor tree = new BinaryTreeLeastCommonAncestor();
		tree.root = new Node8(1);
		tree.root.left = new Node8(2);
		tree.root.right = new Node8(3);
		tree.root.left.left = new Node8(4);
		tree.root.left.right = new Node8(5);
		tree.root.right.left = new Node8(6);
		tree.root.right.right = new Node8(7);
		System.out.println("LCA(4, 5) = " + tree.findLCA(4, 5).data);
		System.out.println("LCA(4, 6) = " + tree.findLCA(4, 6).data);
		System.out.println("LCA(3, 4) = " + tree.findLCA(3, 4).data);
		System.out.println("LCA(2, 4) = " + tree.findLCA(2, 4).data);
	}
}
