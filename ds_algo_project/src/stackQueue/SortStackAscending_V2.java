package stackQueue;

import java.util.Stack;

public class SortStackAscending_V2 {

	// Time - O(n square)
	// Space - 2 stacks are used in total - O(n)
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortStackAscending_V2 sa = new SortStackAscending_V2();
		sa.pushElementsToSort();
	}
	public void pushElementsToSort()
	{
		s1.push(6);
		s1.push(3);
		s1.push(5);
		s1.push(1);
		s1.push(2);
		s1.push(4);
		s1.push(7);
		
		performSorting();
	}
	
	public void performSorting()
	{
		int min = Integer.MAX_VALUE;
		
		int l1= s1.size();
		int loopIn = l1;
		for(int p=0;p<l1;p++)
		{
			for(int i=0;i<loopIn;i++)
			{
				int temp = s1.pop();
				min = min > temp ? temp : min;
				s2.push(temp);
			}
			
			s1.push(min);
			int l2= s2.size();
			for(int i=0;i<l2;i++)
			{
				int temp = s2.pop();
				if(temp!=min)
				{
					s1.push(temp);
				}
			}
			loopIn--;
			min=Integer.MAX_VALUE;
		}
		System.out.println(s1);
	}
}