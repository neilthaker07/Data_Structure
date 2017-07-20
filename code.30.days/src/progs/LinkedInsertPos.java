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
		
		/*System.out.println("SIZE : "+p.size(p.h));
		
		System.out.println(p.getNode(p.h, 2));
		
		System.out.println(p.hasCycle(p.h));
		
		System.out.println(p.mergeLists(p.h, p.h));
		*/
		System.out.println(p.reversePairs(p.h).data);
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
	
	public Node89 mergeLists(Node89 headA, Node89 headB) 
	{
		Node89 head = null;
		if (headA == null && headA == headB) 
		{
			return null;
		}
		else if (headA==null) 
		{
			head = headB;
			Node89 t = headB;
			while(t!=null)
			{
				t=t.next;
			}
			return head;
		}
		else if(headB==null)
		{
			head = headA;
			Node89 t = headA;
			while(t!=null)
			{
				t=t.next;
			}
			return head;
		}
		else 
		{
			if(headA.data < headB.data)
            {
                head = headA;
                headA = headA.next;
            }
            else
            {
                head = headB;
                headB = headB.next;
            }
			Node89 t = head;
			while (headA != null || headB!=null)
			{
				if((headB!=null) && (headA == null || headA.data > headB.data))
				{
					t.next=headB;
					t=headB;
					headB = headB.next;
				}
				else if((headA!=null) && (headB == null || headA.data < headB.data))
				{
					t.next=headA;
					t=headA;
					headA = headA.next;
				}
			}
			return head;
		}
	}
	
	public boolean hasCycle(Node89 head)
	{
		if(head == null)
		{
			return false;
		}
		else
		{
			Node89 ptr1 = head;
			Node89 ptr2 = head.next;
			
			while(ptr1!=null && ptr2!=null)
			{
				if(ptr1==ptr2)
				{
					return true;
				}
				
				if(ptr1.next == null || ptr2.next == null)
				{
					return false;
				}
				ptr1=ptr1.next;
				ptr2=ptr2.next.next;
			}
			
		}
		return false;
	}
	
	int FindMergeNode(Node89 headA, Node89 headB)
	{
		if(headA==null || headB==null)
		{
			return 0;
		}
		
		Node89 t1 = headA;
		Node89 t2 = headB;
		
		int s1=0;
		while(t1!=null)
		{
			t1=t1.next;
			s1++;
		}
		int s2=0;
		while(t2!=null)
		{
			t2=t2.next;
			s2++;
		}
		
		if(t1==t2)
		{
			t1 = headA;
			t2 = headB;
			int diff = Math.abs(s1-s2);
			if(s1>s2)
			{
				int count = 0;
				while(count<diff)
				{
					t1=t1.next;
					count++;
				}
			}
			else if(s2>s1)
			{
				int count = 0;
				while(count<diff)
				{
					t2=t2.next;
					count++;
				}
			}
			
			while(t1!=null && t2.next!=null) 
			{
				if(t1.next == t2.next)
				{
					return t1.next.data;
				}
				t1=t1.next;
				t2=t2.next;
			}
			return 0;
		}
		return 0;
	}
	
	
	Node89 reverseDoubly(Node89 head) 
	{
		Stack<Node89> a = new Stack<Node89>();
		while(head!=null)
		{
			a.push(head);
			head=head.next;
		}
		boolean b = false;
		Node89 prevTemp = null;
		while(!a.isEmpty())
		{
			if(!b)
			{
				head = new Node89();
				b=true;
				head.data = a.pop().data;
				head.prev = null;
				head.next = a.size() != 0 ? a.peek() : null;
				prevTemp = head;
			}
			else
			{
				Node89 p = a.pop();
				p.next = a.size() != 0 ? a.peek() : null;
				p.prev = prevTemp;
				prevTemp = p;
			}
		}
		h=head;
		return head;
	}
	
	Node89 reversePairs(Node89 head)
	{
		Node89 returnHead = null;
		if(head==null)
		{
			return null;
		}
		else
		{
			returnHead = head.next!=null ? head.next : head;
			
			Node89 tmp = null;
			while(head!=null && head.next !=null)
			{
				tmp = head.next;
				head.next = head.next.next;
				tmp.next = head;
				head = tmp;
				
				head = head.next.next;
			}
		}
		
		return returnHead;
	}
}

class Node89 {
    int data;
    Node89 next;
    Node89 prev;
 }