package progs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		StackOperations sp = new StackOperations();
		
		for(int i=0;i<n;i++)
		{
			int nn = a.nextInt();
			if(nn==1)
			{
				long n1= a.nextLong();
				sp.pushInStack(n1);
			}
			else if(nn==2)
			{
				sp.pop();
			}
			else if(nn==3)
			{
				if(sp.stack.size() > 0)
				{
					sp.op.add(sp.stack.peek());
				}
				else
				{
					sp.op.add(null);
				}
			}
		}
		for(int i=0;i<sp.op.size();i++)
		{
			System.out.println(sp.op.get(i));
		}
	}
	ArrayList<Long> op = new ArrayList<Long>();
	Stack<Long> stack = new Stack<Long>();
	public void pushInStack(long no)
	{
		stack.push(no);
	}

	public void pop()
	{
		if(stack.size()>0)
		{
			stack.pop();
		}
	}
	
	
}
