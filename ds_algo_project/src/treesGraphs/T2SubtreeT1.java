package treesGraphs;

import java.util.ArrayList;
import java.util.Collections;

public class T2SubtreeT1 {

	public static void main(String[] args) {
		
		T2SubtreeT1 tree = new T2SubtreeT1();
		
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
		
		//NodeLocal nn3 = new NodeLocal(3);
		NodeLocal nn6 = new NodeLocal(6);
		NodeLocal nn8 = new NodeLocal(8);
		
		//nn3.setLeft(nn6);
		//nn6.setParent(nn3);
		nn6.setLeft(nn8);
		
		nn8.setParent(nn6);
		
		System.out.println(tree.checkSubtree(n1, nn6));
	}

	
	public boolean checkSubtree(NodeLocal root1, NodeLocal root2)
	{
		completeTree1(root1);
		System.out.println(tree1);
		
		completeTree2(root2);
		System.out.println(tree2);
		
		return Collections.indexOfSubList(tree1, tree2) > 0 ? true : false ;
	}
	
	ArrayList tree1 = new ArrayList();
	public void completeTree1(NodeLocal root)
	{
		if(root != null)
		{
			tree1.add(root.data);
		}
		else
		{
			tree1.add(0);
		}
		
		if(!isLeafNode(root))
		{
			completeTree1(root.left);
		}
		if(!isLeafNode(root))
		{
			completeTree1(root.right);
		}
	}
	
	ArrayList tree2 = new ArrayList();
	public void completeTree2(NodeLocal root)
	{
		if(root != null)
		{
			tree2.add(root.data);
		}
		else
		{
			tree2.add(0);
		}
		
		if(!isLeafNode(root))
		{
			completeTree2(root.left);
		}
		if(!isLeafNode(root))
		{
			completeTree2(root.right);
		}
	}
	
	public boolean isLeafNode(NodeLocal n)
	{
		return n== null || (n.left == null && n.right == null) ? true : false; 
	}
}
