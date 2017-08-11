package progs;

import java.util.Scanner;
import java.util.Stack;

public class GameOf2Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int x = in.nextInt();
			int[] a = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
			}
			int[] b = new int[m];
			for (int b_i = 0; b_i < m; b_i++) {
				b[b_i] = in.nextInt();
			}
			// your code goes here
			
			Stack<Long> stack1 = new Stack<Long>();
			Stack<Long> stack2 = new Stack<Long>();
			for(int i=a.length-1;i>=0;i--)
			{
				stack1.push((long) a[i]);
			}
			
			for(int i=b.length-1;i>=0;i--)
			{
				stack2.push((long) b[i]);
			}
			
			long sum=0;
			long count =0;
			while(sum<x)
			{
				if((stack2.isEmpty() && !stack1.isEmpty()) || (!stack1.isEmpty() && stack1.peek() <= stack2.peek()))
				{
					sum+=stack1.pop();
				}
				else if(!stack2.isEmpty())
				{
					sum+=stack2.pop();
				}
				//if(sum<x)
				{
					count ++;
				}
			}
			
			System.out.println(count);
		}
	}

}
