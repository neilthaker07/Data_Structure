package progs;

import java.util.Stack;

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
		
		p.reverse(p.h);
		
		p.nodeList(p.h);
		
		System.out.println("SIZE : "+p.size(p.h));
		
		System.out.println(p.getNode(p.h, 2));
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
	
	public Node89 reverse(Node89 head)
	{
		Stack<Node89> a = new Stack<Node89>();
		while(head!=null)
		{
			a.push(head);
			head=head.next;
		}
		boolean b = false;
		while(!a.isEmpty())
		{
			if(!b)
			{
				head = new Node89();
				b=true;
				head.data = a.pop().data;
				head.next = a.size() != 0 ? a.peek() : null;
			}
			else
			{
				Node89 p = a.pop();
				p.next = a.size() != 0 ? a.peek() : null;
			}
		}
		h=head;
		return head;
	}
	
	public int size(Node89 head)
	{
		int size = 0;
		Node89 t = head;
		while(t!=null)
		{
			t=t.next;
			size++;
		}
		
		return size;
	}
	
	public int getNode(Node89 head, int posFromTail)
	{
		int posFromFront = size(head) - posFromTail - 1;
		Node89 t= head;
		int nodeValue = 0;
		int count = 0;
		while(t!=null)
		{
			if(count==posFromFront)
			{
				nodeValue = t.data; 
				break;
			}
			t=t.next;
			count++;
		}
		return nodeValue;
	}
	
	
	public int CompareLists(Node89 headA, Node89 headB)
	{
		if (headA == null && headA == headB) 
		{
			return 1;
		}
		else if ((headA!=null && headB!=null && headA.data != headB.data) || (headA==null && headB!=null) || (headB==null && headA!=null)) 
		{
			return 0;
		}
		else 
		{
			while (headA != null || headB!=null)
			{
				if ( (headA==null && headB!=null) || (headB==null && headA!=null) || (headA.data != headB.data)) 
				{
					return 0;
				}
				headA = headA.next;
				headB = headB.next;
			}
			return 1;
		}
	}
	
	Node89 mergeLists(Node headA, Node headB) 
	{
		
		
		return null;
	}
	
}

class Node89 {
    int data;
    Node89 next;
 }