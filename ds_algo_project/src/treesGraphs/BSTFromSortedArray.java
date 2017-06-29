package treesGraphs;

import java.util.Arrays;

public class BSTFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[]{1,2,3,4,5,6,7};
		
		BSTFromSortedArray bs = new BSTFromSortedArray();
		bs.createMinHeightBST(array);
	}

	// O(NlogN) : O(logN + NlogN) = O(NlogN) - N is number of nodes.
	// logN for creating array to create Tree.
	// While creating Tree at each addition of Node traversing each node : NlogN
	
	NodeLocal root ;
	int[] tempArray;
	public void createMinHeightBST(int[] nodeArray)
	{
		int l = nodeArray.length;
		int mid = l/2;
		tempArray = new int[l];
		
		tempArray[0] = nodeArray[mid];
		int j=1;
		for(int i=mid+2;i<l;i+=2)
		{
			tempArray[j] = nodeArray[i];
			j++;
		}
		
		for(int i=mid-2;i>=0;i-=2)
		{
			tempArray[j]=nodeArray[i];
			j++;
		}
		
		for(int i=mid+1;i<l;i+=2)
		{
			tempArray[j] = nodeArray[i];
			j++;
		}
		
		for(int i=mid-1;i>=0;i-=2)
		{
			tempArray[j]=nodeArray[i];
			j++;
		}
		System.out.println(Arrays.toString(tempArray));
		makeTree();
	}
	
	public void makeTree()
	{
		//NodeLocal root = new NodeLocal(tempArray[0]);
		MyTree mt = new MyTree();
		
		Node root = new Node();
		for(int i=0;i<tempArray.length;i++)
		{
			Node s = new Node();
			s.setValue(tempArray[i]);
			if(i==0)
			{
				root = s;
			}
			mt.addNode(s);
		}
		mt.preOrder(root);
		
		//recursiveCall(root);
	}
	/*public void recursiveCall(NodeLocal node)
	{
		for(int i=1;i<tempArray.length;i++)
		{
			if(node!=null)
			{
				if(tempArray[i]>node.data)
				{
					node = interrecursive(node, i);
				}
				else
				{
					NodeLocal t = new NodeLocal(tempArray[i]);
					node.left=t;
				}
				
			}
		}
	}

	private NodeLocal interrecursive(NodeLocal node, int i) 
	{
		if(node.right==null && node.data<tempArray[i])
		{
			NodeLocal t = new NodeLocal(tempArray[i]);
			node.right=t;
		}
		else if(node.left==null && node.data>tempArray[i])
		{
			
		}
		else
		{
			node=node.right;
			interrecursive(node, i);
		}
		return node;
	}*/
}