package progs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TopView {

	static Node12 mainRoot = null;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node12 root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		
		scan.close();
		mainRoot = root;
		ArrayList<Integer> nodes = topView(root);
		System.out.println(nodes);
	}
	
	public static Node12 insert(Node12 root, int data) 
	{
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

	static ArrayList<Integer> topView(Node12 root) 
	{
		process(root);
		return a;
	}
	
	static ArrayList<Integer> a = new ArrayList<Integer>();
	static void process(Node12 node)
	{
		processOr(node);
		Collections.sort(a);
		process2(mainRoot);
	}

	private static void processOr(Node12 node) 
	{
		if(node!=null)
		{
			a.add(node.data);
			processOr(node.left);
		}
	}
	
	static void process2(Node12 node)
	{
		if(node!=null && node.right!=null)
		{
			a.add(node.right.data);
			process2(node.right);
		}
	}
}

class Node12 
{
	Node12 left;
	Node12 right;
	int data;

	Node12(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
