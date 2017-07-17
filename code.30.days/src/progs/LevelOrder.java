package progs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrder {

	static Node12 mainRoot = null;

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
		levelOrder(root);
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

	static Queue<Node12> q = new LinkedList<Node12>();
	static void levelOrder(Node12 root) 
	{
		if (root != null) 
		{
			if (!q.contains(root)) 
			{
				q.add(root);
			}
			if(root.left!=null)
			{
				q.add(root.left);
			}
			if(root.right!=null)
			{
				q.add(root.right);
			}
			System.out.print(q.peek().data+" ");
			q.remove();
			levelOrder(q.peek());
		}
	}
}
