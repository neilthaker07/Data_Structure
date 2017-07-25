package progs;

import java.util.Scanner;

public class Sol {

	public static int getHeight(Node10 root) {
		// Write your code here
		
		if(root==null)
		{
			return 0;
		}
		int lh = getHeight(root.left);
		int rh = getHeight(root.right);
		if(leafNode(root))
		{
			return 0;
		}
		else if(lh>rh)
		{
			return lh+1;
		}
		else
		{
			return rh+1;
		}
	}

	public static boolean leafNode(Node10 node)
	{
		return node.left==null && node.right==null ? true : false;
	}
	
	public static Node10 insert(Node10 root, int data) {
		if (root == null) {
			return new Node10(data);
		} else {
			Node10 cur;
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

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node10 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}

class Node10 {
	Node10 left, right;
	int data;

	Node10(int data) {
		this.data = data;
		left = right = null;
	}
}