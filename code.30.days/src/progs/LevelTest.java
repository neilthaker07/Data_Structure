package progs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node44 {
	Node44 left, right;
	int data;

	Node44(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LevelTest {

	public static Node44 insert(Node44 root, int data) {
		if (root == null) {
			return new Node44(data);
		} else {
			Node44 cur;
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
		Node44 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
	static Queue<Node44> q= new LinkedList<Node44>();
	static void levelOrder(Node44 root) 
	{
		if(root!=null)
		{
			q.add(root);
		}
		
		while(!q.isEmpty())
		{
			Node44 t = q.remove();
			System.out.print(t.data+" ");
			if(t.left!=null)
			{
				q.add(t.left);
			}
			if(t.right!=null)
			{
				q.add(t.right);
			}
		}
		
	}
}
