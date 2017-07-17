package progs;

import java.util.*;

public class BSTHeight {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node11 root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		int height = height(root);
		System.out.println(height);
	}

	public static Node11 insert(Node11 root, int data) {
		if (root == null) {
			return new Node11(data);
		} else {
			Node11 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}
	
	static int height(Node11 root) {
      	// Write your code here.
		return process(new Node11[]{root});
    }
	
	static int count = 0;
	static int process(Node11[] nodes)
	{
		if(nodeHasChild(nodes))
		{
			process(listOfChild(nodes));
		}
		return count;
	}
	
	static boolean nodeHasChild(Node11[] nodes)
	{
		for(int i=0;i<nodes.length;i++)
		{
			if(nodes[i] !=null && (nodes[i].left!=null || nodes[i].right!=null))
			{
				count++;
				return true;
			}
		}
		return false;
	}
	
	static Node11[] listOfChild(Node11[] nodes)
	{
		Node11[] children = new Node11[nodes.length*2];
		int l = 0;
		for(int i=0;i<nodes.length;i++)
		{
			if(nodes[i]!=null)
			{
				if(nodes[i].left!=null)
				{
					children[l]=nodes[i].left;
					l++;
				}
				
				if(nodes[i].right!=null)
				{
					children[l]=nodes[i].right;
					l++;
				}
			}
		}
		return children;
	}

}

class Node11 
{
	Node11 left;
	Node11 right;
	int data;

	Node11(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
