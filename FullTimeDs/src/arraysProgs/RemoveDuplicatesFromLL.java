package arraysProgs;

public class RemoveDuplicatesFromLL {

	public static void main(String[] args) {
		
		JJ1 j1 = new JJ1(1);
		JJ1 j2 = new JJ1(2);
		JJ1 j3 = new JJ1(3);
		JJ1 j4 = new JJ1(3);
		JJ1 j5 = new JJ1(5);
		j1.next = j2;
		j2.next = j3;
		j3.next = j4;
		j4.next = j5;
		
		//work(j1);
		//work2(j1);
		removeNode(j1, 3);
		System.out.println();
	}
	
	public static JJ1 work(JJ1 head)
	{
		if(head==null || head.next ==null)
		{
			return head;
		}
		head.next = work(head.next);
		return head.val == head.next.val ? head.next : head;
	}
	
	
	public static JJ1 removeNode(JJ1 head, int val)
	{
		if(head == null)
		{
			return null;
		}
		head.next = removeNode(head.next,val);
		return head.val == val ? head.next : head;
	}
	
	
	public static boolean work2(JJ1 head)
	{
		if(head==null || head.next ==null)
		{
			return true;
		}
		
		JJ1 p1= head;
		JJ1 p2 = head;
		while(p2!=null && p2.next!=null)
		{
			p1 = p1.next;
			p2=p2.next.next;
			
/*			if(p2!=null && p2.next!=null && p2.next.next==null)
			{
				p2 = p2.next;
			}
*/		}
		
		JJ1 p11 = head;
		p1 = p1.next;
		
		return false;
	}

}

class JJ1
{
	public JJ1(int val)
	{
		this.val = val;
	}
	public int val;
	public JJ1 next;
}
