package treesGraphs;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderNoRecursion {
	NodeLocal root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LevelOrderNoRecursion tree = new LevelOrderNoRecursion();
		tree.root = new NodeLocal(1);
		tree.root.left = new NodeLocal(2);
		tree.root.right = new NodeLocal(3);
		tree.root.right.left = new NodeLocal(11);
		tree.root.right.right = new NodeLocal(12);
		tree.root.left.left = new NodeLocal(4);
		tree.root.left.right = new NodeLocal(5);
		tree.root.left.left.left = new NodeLocal(8);
        tree.root.left.left.right = new NodeLocal(9);
        tree.root.left.right.left = new NodeLocal(6);
        tree.root.left.right.right = new NodeLocal(7);
		tree.levelOrder();
	}
	Queue<NodeLocal> pl = new LinkedList<NodeLocal>();
	void levelOrder() 
	{
		pl.add(root);
		NodeLocal node = root;
		while(!pl.isEmpty())
		{
			if(node!=null)
			{
				if(!pl.contains(node))
				{
					pl.add(node);
				}
				pl.add(node.left);
				pl.add(node.right);
				System.out.println(pl.peek().data);
				pl.remove();
				node = pl.peek();
			}
		}
	}
}
