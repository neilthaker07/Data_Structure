package linkedListEx;

public class ReverseNoSum {
    // input : 1 2 3   and 4 5 6 
	// so 321+654 = 975 
	// output : 5 7 9
	static int size = 0;
	static Node head= null;
	static Node tail = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreationLinkedList c = new CreationLinkedList();
		c.addNode(1);
		c.addNode(2);
		c.addNode(3);
		c.addNode(4);
		c.addNode(5);
		c.addNode(6);
		
		size=c.size();
		head=c.head;
		tail=c.tail;

		ReverseNoSum rn = new ReverseNoSum();
		/*c.head = */rn.part();
		
		//System.out.println(c);
		/*Node h =head;
		for(int i=0;i<size/2;i++)
		{
			System.out.println(h);
			h=h.getNext();
		}*/
	}
	
	public Node part()
	{
		Node n = head;
		int m=1;
		int left=0;
		for(int i=0;i<size/2;i++)
		{
			left+=n.getValue()*m;
			n=n.getNext();
			m=m*10;
		}
		int mm=1;
		int right=0;
		for(int i=0;i<size/2;i++)
		{
			right+=n.getValue()*mm;
			n=n.getNext();
			mm=mm*10;
		}
		int result=left+right;
		
		Node n1= head;
		Node prev = null;
		boolean oneTime=false;
		for(int i=0;i<size/2;i++)
		{
			if(n1==head && !oneTime)
			{
				n1.setValue(result%10);
				head=n1;
				oneTime=true;
			}
			else
			{
				n1.setValue(result%10);
				prev.setNext(n1);
			}
			n1.setNext(null);
			prev=n1;
			result=result/10;
			System.out.print(n1.getValue()+" ");
		}
		return head;
	}
}
