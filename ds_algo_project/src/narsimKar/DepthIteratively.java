package narsimKar;

import java.util.LinkedList;
import java.util.Queue;

public class DepthIteratively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepthIteratively p = new DepthIteratively();
		p.createBT();
		int h = p.depth(p.root);
		System.out.println(h);
	}

	public void createBT()
	{
		Node78 node1 = new Node78();
		Node78 node2 = new Node78();
		Node78 node3 = new Node78();
		Node78 node4 = new Node78();
		Node78 node5 = new Node78();
		Node78 node6 = new Node78();
		Node78 node7 = new Node78();
		//Node78 node8 = new Node78();
		
		node1.data = 1;
		node2.data = 2;
		node3.data = 3;
		node4.data = 4;
		node5.data = 5;
		node6.data = 6;
		node7.data = 7;
		//node8.data = 8;
		
		node1.left = node2;
		node1.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		//node4.left = node8;
		
		root = node1;
	}
	
	Node78 root;
	Queue<Node78> q = new LinkedList<Node78>();
	public int depth(Node78 root)
	{
		Node78 temp = new Node78();
		temp.data=0;
		int level = 0;
		q.add(root);
		q.add(temp);
		while(!q.isEmpty())
		{
			Node78 n = q.remove();
			if(n==temp)
			{
				if(!q.isEmpty())
				{
					q.add(temp);
				}
				level++;
			}
			else
			{
				if(n.left!=null)
				{
					q.add(n.left);
				}
				if(n.right!=null)
				{
					q.add(n.right);
				}
			}
		}
		return level;
	}
}
