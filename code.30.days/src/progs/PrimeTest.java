package progs;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		int s = a.nextInt();
		long no[]= new long[s];
		for(int i=0;i<s;i++)
		{
			no[i] = a.nextLong();
		}
		
		for(int i=0;i<s;i++)
		{
			long num = no[i];
			boolean b1=false;
			if(num==0 || num==1)
			{
				System.out.println("Not prime");
				b1=true;
			}
			long x = (long) Math.sqrt(num);
			for(int k=2;k<x-1;k++)
			{
				if(x%k==0)
				{
					x--;
					k=2;
				}
			}
			
			for(long j=2;j<=x;j++)
			{
				if(num%j==0)
				{
					System.out.println("Not prime");
					b1=true;
					break;
				}
			}
			if(!b1)
			{
				System.out.println("Prime");
			}
		}
	}

}
