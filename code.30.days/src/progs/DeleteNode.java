package progs;

public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		
	//	ListNode tt = reverseList(ln1);
	//	System.out.println(tt.next.val);
		
		ListNode e1 = new ListNode(1);
		ListNode e2 = new ListNode(3);
		ListNode e3 = new ListNode(4);
		e1.next = e2;
		e2.next = e3;
		
		//ListNode q = deleteDuplicates(ln1);
		
		//ListNode q = mergeLLRecursive(ln1, e1);
		//System.out.println(getKthElementFromEnd(ln1, 1).val);
		ListNode q = removeKthElementFromEnd(ln1, 1);
		while(q!=null)
		{
			System.out.println(q.val);
			q =q.next;
		}
		
		System.out.println();
	}
	
	public static ListNode getKthElementFromEnd(ListNode head, int n)
	{
		ListNode p1 = head;
		ListNode p2 = head;
		int i=0;
		while(i<n-1)
		{
			p2 = p2.next;
			i++;
		}
		
		while(p2.next!=null)
		{
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p1;
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA== null || headB == null)
        {
        	return null;
        }
		int l1 = 0;
		int l2 = 0;
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		while(temp1!=null)
		{
			temp1 = temp1.next;
			l1++;
		}
		
		while(temp2!=null)
		{
			temp2 = temp2.next;
			l2++;
		}
		
		if(l1!=l2)
		{
			if(l1 > l2)
			{
				while(headA!=null && l1!=l2)
				{
					headA=headA.next;
					l2++;
				}
			}
			else if(l1 < l2)
			{
				while(headB!=null && l1!=l2)
				{
					headB=headB.next;
					l1++;
				}
			}
		}
		
		while(headA!=null && headB!=null)
		{
			if(headA==headB)
			{
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
    }
	
	public static boolean isPalindrome(ListNode head){
		if (head == null) {
            return true;
        }
        ListNode slow = head, fast = head, rev = null;
        
        while (fast != null && fast.next != null) { 
            ListNode temp = rev;
            rev = slow;
            slow = slow.next;
            fast = fast.next.next;
            rev.next = temp; 
        }
        
        if (fast != null) {
            slow = slow.next;
        }
        
        while (rev != null) {
            if (slow.val != rev.val) {
                return false;
            }
            slow = slow.next;
            rev = rev.next;
        }
        return true;
	}
	
	public static ListNode removeKthElementFromEnd(ListNode head, int n)
	{
		ListNode p1 = head;
		ListNode p2 = head;
		int i=0;
		
		while(i<=n-1)
		{
			if(p2 == null) // remove nth element where n > length of LL
			{
				return head;
			}
			p2 = p2.next;
			i++;
		}
		
		if(p2==null) // remove nth element where n = length of LL
		{
			p1 = p1.next;
			return p1;
		}
		else
		{
			while(p2.next!=null)
			{
				p1 = p1.next;
				p2 = p2.next;
			}
			p1.next = p1.next.next;
			//return p1.next; removed node
			return head;
		}
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null)return head;
        head.next = deleteDuplicates(head.next);
        return head.val == head.next.val ? head.next : head;
	}
	
	public ListNode removeElements(ListNode head, int val) {
		
		if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
		
		/*
		
		if(head == null)
		{
			return null;
		}
		ListNode prev = head;
		head = head.next;
		if(head == null && prev.val == val)
		{
			return null;
		}
		else if(head == null)
		{
			return prev;
		}
		
		while(prev!=null && prev.val == val)
		{
			prev = prev.next;
			head = head.next;
		}
		
		while(head!=null)
		{
			if(head.val == val)
			{
				prev.next = head.next;
				head = head.next;
			}
			else
			{
				head = head.next;
				prev = prev.next;
			}
		}
		return head;
	*/}
	
	public static boolean hasCycle(ListNode head) {
        
		if(head == null || head.next == null)
		{
			return false;
		}
		ListNode p1 = head;
		ListNode p2 = head;
		while(p1!=null && p2!=null && p1.next!=null)
		{
			p1 = p1.next;
			p2 = p2.next == null ? null : p2.next.next;
			if(p1 == p2)
			{
				return true;
			}
		}
		return false;
    }
	
	public static ListNode mergeLLRecursive(ListNode l1, ListNode l2)
	{
		if(l1==null)
		{
			return l2;
		}
		if(l2==null)
		{
			return l1;
		}
		
		if(l1.val < l2.val)
		{
			l1.next = mergeLLRecursive(l1.next, l2);
			return l1;
		}
		else
		{
			l2.next = mergeLLRecursive(l2.next, l1);
			return l2;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     
		if(l1==null && l2==null)
		{
			return null;
		}
		else
		{
			if(l2 == null)
			{
				return l1;
			}
			else if(l1==null)
			{
				return l2;
			}
			
			ListNode op = l1.val > l2.val ? l2 : l1;
			if(l1.val > l2.val)
			{
				l2 = l2.next;
			}
			else
			{
				l1 = l1.next;
			}
			
			while(l1!=null || l2!=null)
			{
                if(l2 == null)
                {
                    op.next = l1;
					l1 = l1.next;
                }
                else if(l1==null)
                {
                    op.next = l2;
					l2 = l2.next;
                }
                else
                {
                    if(l1.val < l2.val)
                    {
                        op.next = l1;
                        l1 = l1.next;
                    }
                    else
                    {
                        op.next = l2;
                        l2 = l2.next;
                    }
                }
				
			}
			return op;
		}
    }

	public static void deleteNode(ListNode node) {

		if(node.next!=null)
		{
			node.val = node.next.val;
			node.next = node.next.next;
		}
		else
		{
			node = null;
		}
	}
	
	
	//recursive
	private static ListNode reverseListInt2(ListNode head, ListNode newHead) {
	    if (head == null)
	        return newHead;
	    ListNode next = head.next;
	    head.next = newHead;
	    return reverseListInt2(next, head);
	}
	
	// iterative
	 public static ListNode reverseList(ListNode head) {
	 
		ListNode newHead = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		 return newHead;
	 }
		 
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}