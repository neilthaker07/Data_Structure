package linkedListEx;

public class PallindromeLinkedList {
	
	static int size = 0;
	static Node head= null;
	static Node tail = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreationLinkedList c = new CreationLinkedList();
		c.addNode(1);
		c.addNode(2);
		c.addNode(3);
		c.addNode(3);
		c.addNode(2);
		c.addNode(1);
		
		size=c.size();
		head=c.head;
		tail=c.tail;

		PallindromeLinkedList pl = new PallindromeLinkedList();
		pl.palindromeCheck();
	}
	
	public void palindromeCheck()
	{
		Node n = head;
		int r1 = 0;
		int m1=1;
		for(int i=0;i<size/2;i++)
		{
			r1+=n.getValue()*m1;
			n=n.getNext();
			m1*=10;
		}
		int m2=1;
		for(int i=0;i<size/2;i++)
		{
			m2*=10;
		}
		m2/=10;
		int r2= 0;
		if(size%2!=0)
		{
			n=n.getNext();
		}
		for(int i=0;i<size/2;i++)
		{
			r2+=n.getValue()*m2;
			n=n.getNext();
			m2/=10;
		}
		System.out.println(r1==r2 ? true : false);
		//System.out.println(r2);
		
	}
	

}
