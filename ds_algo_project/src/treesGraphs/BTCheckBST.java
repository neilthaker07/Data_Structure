package treesGraphs;

public class BTCheckBST {

	NodeLocal root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTCheckBST tree = new BTCheckBST();
		tree.root = new NodeLocal(5);
		tree.root.left = new NodeLocal(3);
		tree.root.right = new NodeLocal(9);
		tree.root.left.left = new NodeLocal(2);
		tree.root.left.left.left = new NodeLocal(1);
		tree.root.left.right = new NodeLocal(4);
		/*tree.root.right.left = new NodeLocal(11);
		tree.root.right.right = new NodeLocal(12);
		tree.root.left.left.left = new NodeLocal(8);
        tree.root.left.left.right = new NodeLocal(9);
        tree.root.left.right.left = new NodeLocal(6);
        tree.root.left.right.right = new NodeLocal(7);
        tree.root.left.right.right.left = new NodeLocal(17);*/

        System.out.println(tree.isBST(tree.root));
	}

	
	NodeLocal mainRoot = root;
	public boolean isBST(NodeLocal root)
	{
		if(!isLeafNode(root) && 
				(root.left == null || root.left.data <= root.data ) && 
				(root.right == null || root.data <= root.right.data))
		{
			boolean l = false;
			boolean r = false;
			
			if(root.left != null)
			{
				l = isBST(root.left);
			}
			
			if(l && root.right!=null)
			{
				 r = isBST(root.right);
			}
			if(r || root.right == null)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else if(isLeafNode(root))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isLeafNode(NodeLocal node)
	{
		if(node.left == null && node.right == null)
		{
			return true;
		}
		return false;
	}
}