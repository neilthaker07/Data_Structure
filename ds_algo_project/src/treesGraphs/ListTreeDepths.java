package treesGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTreeDepths {

	NodeLocal root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListTreeDepths tree = new ListTreeDepths();
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

        //NodeLocal[] node= new NodeLocal[]{tree.root};
        ArrayList<NodeLocal> node = new ArrayList<NodeLocal>();
        node.add(tree.root);
        tree.depths(node);
	}
	
	public void depths(ArrayList<NodeLocal> nodes)
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		for(NodeLocal l : nodes)
		{
			if(l!=null)
			{
				l1.add(l.data);
			}
		}
		System.out.println(l1);
		
		ArrayList<NodeLocal> temp = new ArrayList<NodeLocal>();
		//NodeLocal temp[] = new NodeLocal[nodes.length*2];
		//int p=0;
		for(NodeLocal l : nodes)
		{
			if(l!=null && !isLeafNode(l))
			{
				if(l.left!=null)
				{
					temp.add(l.left);
					/*temp[p] = l.left;
					p++;*/
				}
				if(l.right!=null)
				{
					temp.add(l.right);
					/*temp[p]=l.right;
					p++;*/
				}
			}
		}
		if(temp.size()>0)
		{
			depths(temp);
		}
		
		/*for(int i=0;i<temp.length;i++)
		{
			if(temp[i] != null)
			{
				depths(temp);
				break;
			}
		}*/
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
