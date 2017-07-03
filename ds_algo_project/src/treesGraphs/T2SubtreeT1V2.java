package treesGraphs;

public class T2SubtreeT1V2 {

	public static void main(String[] args) {
		
		T2SubtreeT1V2 tree = new T2SubtreeT1V2();
		
		NodeLocal n1 = new NodeLocal(1);
		NodeLocal n2 = new NodeLocal(2);
		NodeLocal n3 = new NodeLocal(3);
		NodeLocal n4 = new NodeLocal(4);
		NodeLocal n5 = new NodeLocal(5);
		NodeLocal n6 = new NodeLocal(6);
		NodeLocal n7 = new NodeLocal(7);
		NodeLocal n8 = new NodeLocal(8);
		NodeLocal n9 = new NodeLocal(9);
		NodeLocal n10 = new NodeLocal(10);
		
		n1.setLeft(n2);
		n1.setRight(n3);
		
		n2.setLeft(n4);
		n2.setRight(n5);
		n2.setParent(n1);
		
		n3.setLeft(n6);
		n3.setRight(n7);
		n3.setParent(n1);

		n4.setParent(n2);

		n5.setParent(n2);
		
		n6.setParent(n3);
		n6.setLeft(n8);
		//n6.setRight(n9);
			
		n7.setParent(n3);
		n7.setRight(n10);
		
		n8.setParent(n6);
		
		n10.setParent(n7);
		
		NodeLocal nn3 = new NodeLocal(3);
		NodeLocal nn6 = new NodeLocal(6);
		NodeLocal nn8 = new NodeLocal(8);
		
		nn3.setLeft(nn6);
		
		nn6.setParent(nn3);
		nn6.setLeft(nn8);
		
		nn8.setParent(nn6);

		System.out.println(tree.treeCheckSubtree(n1, nn3));
	}
	
	public boolean treeCheckSubtree(NodeLocal root1, NodeLocal root2)
	{
		if(root2==null)
		{
			return true;
		}
		return checkMainT1(root1,root2);
	}
	public boolean checkMainT1(NodeLocal root1,NodeLocal root2 )
	{
		if(root1==null)
		{
			return false;
		}
		else if(root1.data == root2.data && matchTree(root1,root2))
		{
			return true;
		}
		return checkMainT1(root1.getLeft(), root2) || checkMainT1(root1.getRight(), root2);
	}
	
	public boolean matchTree(NodeLocal r1,NodeLocal r2)
	{
		if(r1==null && r2==null)
		{
			return true;
		}
		else if(r1==null || r2==null)
		{
			return false;
		}
		else if(r1.data!=r2.data)
		{
			return false;
		}
		else
		{
			return matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right);
		}
	}
}