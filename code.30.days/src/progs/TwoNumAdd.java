package progs;

public class TwoNumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creation();
	}
	static void creation()
	{
		ListNode1 l1 = new ListNode1(1);
		/*ListNode1 l2 = new ListNode1(4);
		ListNode1 l3 = new ListNode1(3);
		l1.next = l2;
		l2.next= l3;*/
		
		ListNode1 l4 = new ListNode1(9);
		ListNode1 l5 = new ListNode1(9);
		//ListNode1 l6 = new ListNode1(9);
		l4.next = l5;
	//	l5.next= l6;
		
		add(l1, l4);
		
	}
	static void add(ListNode1 l1 , ListNode1 l2)
	{ 
		ListNode1 lf = null;
		ListNode1 prev = null;
		ListNode1 head = null;
		int t2 = 0;
		while(l1!=null || l2!=null  || t2>0)
		{
            if(l1==null && l2==null && t2>0)
			{
				lf = new ListNode1(1);
				prev.next = lf;
				prev = lf;
				break;
			}
            
            int t1 = getT1(l1, l2)+t2;
            int t3 = t1;
			t1 = t3>9 ? t3%10 : t3;
			
			lf = new ListNode1(t1);

            t2 = getT2(t3);
			
			if(head==null)
			{
				head = lf;
			}

			prev = setPrev(lf, prev);
			
			if(l1!=null)
            {
                l1 = l1.next;
            }
            if(l2!=null)
            {
                l2=l2.next;
            }
        }
		
		while(head!=null)
		{
			System.out.println(head.val);
			head=head.next;
		}
		//return head;
	}
	private static ListNode1 setPrev(ListNode1 lf, ListNode1 prev) {
		if(prev!=null)
		{
			prev.next = lf;
		}
		prev = lf;
		return prev;
	}
	private static int getT2(int t3) 
	{
		int t2 = t3 >9 ? 1 : 0;    
		return t2;
	}
	private static int getT1(ListNode1 l1, ListNode1 l2) {
		int t1;
		if(l1!=null && l2!=null)
		{
		    t1 = l1.val+l2.val;
		}
		else if (l1!=null)
		{
		    t1 = l1.val;
		}
		else
		{
		    t1= l2.val;
		}
		return t1;
	}
}

class ListNode1 {
	int val;
	ListNode1 next;

	ListNode1(int x) {
		val = x;
	}
}