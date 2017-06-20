package linkedListEx;

public class RemoveDups {

	static int size = 0;
	static CreationLinkedList c = new CreationLinkedList();
	Node head = c.head;
	Node tail = c.tail;
	
	
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
		
		RemoveDups rd = new RemoveDups();
		rd.removeDuplicate();
		System.out.println(c);
		System.out.println("size = "+size);
	}
	
	// No buffer
	// O(N square) - time complexity 
	// O(1) - space complexity
	public void removeDuplicate()
	{
		Node h = head;
		for(int i=0;i<size;i++)
		{
			Node cur = h;
			Node next = cur.getNext();
			while(next!=null)
			{
				if(h.getValue()==next.getValue())
				{
					cur.setNext(next.getNext());
					size--;
				}
				cur=next;
				next=next.getNext();
			}
			h=h.getNext();
		}
	}

}
