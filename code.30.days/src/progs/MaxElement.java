package progs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s  = new Scanner(System.in);
		long a = s.nextLong();
		long ip[] = new long[(int) a];
		Stack<Long> stack = new Stack<Long>();
		ArrayList<Long> op= new ArrayList<Long>();
		
		long max=0;
		for(int i=0;i<a;i++)
		{
			ip[i] = s.nextInt();
			if(ip[i]==1)
			{
				long x = s.nextLong();
				stack.push(x);
				max =  max < x ? x : max;
			}
			else if(ip[i]==2)
			{
				long x = stack.pop();
				if(stack.isEmpty())
				{
					max=0;
				}
				else if(x == max) 
				{
					max = 0;
					for(int k=stack.size()-1;k>=0;k--)
					{
						long t = stack.get(k);
						max = max<t ? t : max;
					}
				}
			}
			else if(ip[i]==3)
			{
				op.add(max);
			}
		}
		
		for(int i=0;i<op.size();i++)
		{
			System.out.println(op.get(i));
		}
		
	}
	

}
