package progs;

import java.util.Scanner;

public class IsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node12 root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		
		System.out.println(checkBST(root));
	}

	public static Node12 insert(Node12 root, int data) {
		if (root == null) {
			return new Node12(data);
		} else {
			Node12 cur;
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
	
	
	public static boolean checkBST(Node12 root)
	{
		if (root == null) 
		{
			return false;
		}
		return process(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	public static boolean process(Node12 node, long min, long max)
	{
		if(node==null)
		{
			return true;
		}
		if(/*node.left.data > node.data || node.right.data<node.data ||*/node.data<min || node.data>max)
		{
			return false;
		}
		else
		{
			return process(node.left,min,node.data) && process(node.right,node.data,max); 
		}
	}
	
	static boolean isLeaf(Node12 node)
	{
		return node.left!=null || node.right!=null ? false : true;
	}
	
	/*if (node == null)
    return true;

 false if this node violates the min/max constraints 
if (node.data < min || node.data > max)
    return false;

 otherwise check the subtrees recursively
tightening the min/max constraints 
// Allow only distinct values
return (process(node.left, min, node.data-1) &&
		process(node.right, node.data+1, max));*/
/*
if( (node.left!=null && node.left.data >= node.data) || (node.right!=null && node.right.data <= node.data) 
		
		)
{
	return false;
}

if(node.left!=null && !isLeaf(node.left))
{
	process(node.left,min,max);
}
if(node.right!=null && !isLeaf(node.right))
{
	process(node.right,min,max);
}
return true;*/
}
