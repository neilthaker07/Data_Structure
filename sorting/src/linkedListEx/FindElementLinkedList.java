package linkedListEx;

import java.util.HashSet;

public class FindElementLinkedList {

	static int size = 0;
	static CreationLinkedList c = new CreationLinkedList();
	Node head = c.head;
	Node tail = c.tail;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c.addNode(5);
		c.addNode(3);
		c.addNode(6);
		c.addNode(1);
		c.addNode(9);
		size = c.size();
		
		FindElementLinkedList fd = new FindElementLinkedList();
		//fd.getKthToLast(2);
		fd.getKthFromLast(2);
		
/*		System.out.println(c);
		System.out.println("size = "+size);*/
		
	}
	
	// O(n) space
	public void getKthToLast(int k)
	{
		Node n = head;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<size;i++)
		{
			if(i>=k)
			{
				hs.add(n.getValue());
			}
			n=n.getNext();
		}
		System.out.println(hs);
	}
	
	// O(n) time  , O(1) space
	public void getKthFromLast(int k)
	{
		Node p1 = head;
		Node p2 = head;
		
		for(int i=0;i<k;i++)
		{
			p1=p1.getNext();
		}
		while(p1!=null)
		{
			p1=p1.getNext();
			p2=p2.getNext();
		}
		System.out.println(p2);
	}
}
