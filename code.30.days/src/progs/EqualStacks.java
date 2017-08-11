package progs;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		int h1[] = new int[n1];
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1[h1_i] = in.nextInt();
		}
		int h2[] = new int[n2];
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2[h2_i] = in.nextInt();
		}
		int h3[] = new int[n3];
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3[h3_i] = in.nextInt();
		}
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();
		
		long t1 = 0;
		long t2 = 0;
		long t3 = 0;
		for(int i=h1.length-1;i>=0;i--)
		{
			t1+=h1[i];
			s1.push(h1[i]);
		}
		for(int i=h2.length-1;i>=0;i--)
		{
			t2+=h2[i];
			s2.push(h2[i]);
		}
		for(int i=h3.length-1;i>=0;i--)
		{
			t3+=h3[i];
			s3.push(h3[i]);
		}
		
		while(t1!=t2 || t2!=t3)
		{
			if(t1>t2 || t1>t3)
			{
				if(!s1.isEmpty())
				{
					t1=t1-s1.pop();
				}
			}
			if(t2>t3 || t2>t1)
			{
				if(!s2.isEmpty())
				{
					t2=t2-s2.pop();
				}
			}
			if(t3>t1 || t3>t2)
			{
				if(!s3.isEmpty())
				{
					t3=t3-s3.pop();
				}
			}
		}
		
		System.out.println(t1);
	}

}
