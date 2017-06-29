package treesGraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderNoRecursion {

	NodeLocal root;

	List<Integer> postorder() 
 {
		List<Integer> res = new ArrayList<Integer>();
		if (root == null) {
			return res;
		}
		Stack<NodeLocal> stack = new Stack<NodeLocal>();
		stack.push(root);

		while (!stack.isEmpty()) {
			NodeLocal temp = stack.peek();
			if (temp.left == null && temp.right == null) {
				NodeLocal pop = stack.pop();
				res.add(pop.data);
			} else {
				if (temp.right != null) {
					stack.push(temp.right);
					temp.right = null;
				}

				if (temp.left != null) {
					stack.push(temp.left);
					temp.left = null;
				}
			}
		}
		return res;
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
		System.out.println(tree.postorder());
	}
}
