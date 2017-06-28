package treesGraphs;

import java.util.Stack;

public class PostOrderNoRecursion {

	NodeLocal root;

	void inorder() {
		if (root == null) {
			return;
		}

		// keep the nodes in the path that are waiting to be visited
		Stack<NodeLocal> stack = new Stack<NodeLocal>();
		NodeLocal node = root;

		stack.push(root);
		while(!stack.isEmpty())
		{
			NodeLocal nl = node;
			
			while(nl.left!=null)
			{
				stack.push(nl.left);
				nl = nl.left;
			}
			System.out.println(nl);
			NodeLocal pl = stack.pop();
			System.out.println(pl);
			if(pl.right!=null)
			{
				stack.push(pl.right);
			}
			nl = pl.right;
		}
	}

	public static void main(String args[]) {

		PostOrderNoRecursion tree = new PostOrderNoRecursion();
		tree.root = new NodeLocal(1);
		tree.root.left = new NodeLocal(2);
		tree.root.right = new NodeLocal(3);
		tree.root.left.left = new NodeLocal(4);
		tree.root.left.right = new NodeLocal(5);
		tree.root.left.left.left = new NodeLocal(8);
        tree.root.left.left.right = new NodeLocal(9);
        tree.root.left.right.left = new NodeLocal(6);
        tree.root.left.right.right = new NodeLocal(7);
		tree.inorder();
	}
}
