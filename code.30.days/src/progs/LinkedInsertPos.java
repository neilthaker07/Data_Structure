package progs;

public class LinkedInsertPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedInsertPos p = new LinkedInsertPos();
		p.insertNth(null, 3, 0);
		p.insertNth(p.h, 5, 1);
		p.insertNth(p.h, 4, 2);
		p.insertNth(p.h, 2, 3);
		p.insertNth(p.h, 10, 1);
		
		p.nodeList(p.h);
	}
	Node89 h = null;
	void nodeList(Node89 node)
	{
		while(node!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	Node89 insertNth(Node89 head, int data, int position) 
	{
		if(head==null)
		{
			head = new Node89();
			head.data = data;
			head.next = null;
		}
		else if(position==0)
		{
			Node89 t2 = head;
			head = new Node89();
			head.data = data;
			head.next = t2;	
		}
		else
		{
			int count = 0;
			Node89 temp = head;
			while(temp!=null)
			{
				if(position == count+1)
				{
					Node89 t2 = temp.next;
					temp.next = new Node89();
					temp.next.data = data;
					temp.next.next = t2; 
					break;
				}
				temp = temp.next;
				count++;	
			}
		}
		h=head;
		return head;
	}
}


class Node89 {
    int data;
    Node89 next;
 }