package linkedListEx;

public class PartitionBook {

	Node head = null;
	Node tail = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node a1 = new Node();
		a1.setValue(3);
		Node a2 = new Node();
		a2.setValue(5);
		Node a3 = new Node();
		a3.setValue(8);
		Node a4 = new Node();
		a4.setValue(5);
		Node a5 = new Node();
		a5.setValue(10);
		Node a6 = new Node();
		a6.setValue(2);
		Node a7 = new Node();
		a7.setValue(1);
		PartitionBook pb = new PartitionBook();
		pb.part(a1, 5);
		pb.part(a2, 5);
		pb.part(a3, 5);
		pb.part(a4, 5);
		pb.part(a5, 5);
		pb.part(a6, 5);
		pb.part(a7, 5);
		
		Node n=pb.head;
		for(int i=0;i<7;i++)
		{
			System.out.print(n+" ");
			n=n.getNext();
		}
	}
	
	public void part(Node n, int p)
	{
		if(head==null && tail==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			if(n.getValue()<p)
			{
				n.setNext(head);
				head=n;
			}
			else
			{
				tail.setNext(n);
				tail=n;
			}
		}
	}
}
