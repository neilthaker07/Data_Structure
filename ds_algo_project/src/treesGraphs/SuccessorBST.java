package treesGraphs;

public class SuccessorBST {

	public static void main(String a[])
	{
		SuccessorBST tree = new SuccessorBST();
		NodeLocal n1 = new NodeLocal(90);
		NodeLocal n2 = new NodeLocal(70);
		NodeLocal n3 = new NodeLocal(100);
		NodeLocal n4 = new NodeLocal(30);
		NodeLocal n5 = new NodeLocal(80);
		NodeLocal n6 = new NodeLocal(95);
		NodeLocal n7 = new NodeLocal(200);
		
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
		
		n7.setParent(n3);
		
		tree.getSuccessor(n7);
	}

	
	public void getSuccessor(NodeLocal search)
	{
		if(search == null)
		{
			System.out.println("No such node exists. Please correct input.");
		}
		else if(!isLeafNode(search))
		{
			System.out.println(findSmallestChildNode(search.getRight()).data);
		}
		else
		{
			if(isLeftLeaf(search))
			{
				System.out.println(search.getParent().data);
			}
			else // right leaf
			{
				NodeLocal ans = findBiggerNode(search);
				if(ans != null)
				{
					System.out.println(ans.data);
				}
				else
				{
					System.out.println("THIS is last node. No successor");
				}
			}
		}
	}

	public NodeLocal findSmallestChildNode(NodeLocal node) 
	{
		while(node.getLeft() != null)
		{
			node=node.getLeft();
		}
		return node;
	}
	
	public NodeLocal findBiggerNode(NodeLocal node)
	{
		NodeLocal original = node;
		while(node.getParent() != null)
		{
			if(node.getParent().data > original.data)
			{
				return node.getParent();
			}
			node=node.getParent();
		}
		return null;
	}
	
	public boolean isLeafNode(NodeLocal n)
	{
		return n.left == null && n.right == null ? true : false; 
	}
	
	public boolean isLeftLeaf(NodeLocal n)
	{
		return n.getParent().getLeft() == n ? true : false; 
	}
}
