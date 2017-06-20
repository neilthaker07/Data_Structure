package linkedListEx;

import java.util.HashSet;

public class RemoveDuplicatesBuffer {


	static int size = 0;
	static CreationLinkedList c = new CreationLinkedList();
	Node head = c.head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		c.addNode(5);
		c.addNode(3);
		c.addNode(6);
		c.addNode(6);
		c.addNode(1);
		c.addNode(3);
		c.addNode(8);
		c.addNode(5);
		size = c.size();
		
		RemoveDuplicatesBuffer rd = new RemoveDuplicatesBuffer();
		rd.removeDuplicate();
		
		System.out.println(c);
		System.out.println("size = "+size);
		
	}
	
	public void removeDuplicate()
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		Node n = head;
		Node prev = null;
		while(n!=null)
		{
			if(hs.contains(n.getValue()))
			{
				prev.setNext(n.getNext());
				size--;
			}
			hs.add(n.getValue());
			prev = n;
			n=n.getNext();
		}
		
	}

}
