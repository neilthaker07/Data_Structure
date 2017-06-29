package treesGraphs;

import java.util.Stack;

public class PreOrderNoRecursion {

	NodeLocal root;

	void preorder() {
		if (root == null) {
			return;
		}

		// keep the nodes in the path that are waiting to be visited
		Stack<NodeLocal> stack = new Stack<NodeLocal>();
		NodeLocal node = root;

		stack.push(root);
		while(!stack.isEmpty())
		{
			// Pop the top item from stack and print it
            NodeLocal mynode = stack.peek();
            System.out.print(mynode.data + " ");
            stack.pop();
 
            // Push right and left children of the popped node to stack
            if (mynode.right != null) {
            	stack.push(mynode.right);
            }
            if (mynode.left != null) {
            	stack.push(mynode.left);
            }
			
			
			
		}
	}

	public static void main(String args[]) {

		PreOrderNoRecursion tree = new PreOrderNoRecursion();
		tree.root = new NodeLocal(1);
		tree.root.left = new NodeLocal(2);
		tree.root.right = new NodeLocal(3);
		tree.root.left.left = new NodeLocal(4);
		tree.root.left.right = new NodeLocal(5);
		tree.root.left.left.left = new NodeLocal(8);
        tree.root.left.left.right = new NodeLocal(9);
        tree.root.left.right.left = new NodeLocal(6);
        tree.root.left.right.right = new NodeLocal(7);
		tree.preorder();
	}
}
