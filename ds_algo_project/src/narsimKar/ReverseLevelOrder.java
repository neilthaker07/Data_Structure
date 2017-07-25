package narsimKar;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLevelOrder p = new ReverseLevelOrder();
		p.createBT();
		p.reverse(p.root);
		
		while(p.s.size()!=0)
		{
			System.out.println(p.s.pop());
		}
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
	Stack<Integer> s = new Stack<Integer>();
	public void reverse(Node78 root)
	{
		q.add(root);
		while(root!=null)
		{
			
			q.add(q.peek().right);
			q.add(q.peek().left);
			
			Node78 t = q.remove(); 
			s.push(t.data);

			root = q.peek();
		}
	}
}
