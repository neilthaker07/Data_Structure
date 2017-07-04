package recursionDp;

import java.util.Scanner;

public class RecursiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveSequence r = new RecursiveSequence();
		Scanner sc1 = new Scanner(System.in);
		int numberOfTests = sc1.nextInt();
		
		long u[] = new long[numberOfTests];
		for(int i=0;i<numberOfTests;i++)
		{
			int input = sc1.nextInt();
			u[i]=r.nthTerm(input);
		}
		for(int i=0;i<numberOfTests;i++)
		{
			System.out.println(u[i]);
		}
	}

	/*int c=0;
	int op=1;
	*/private long nthTerm(int n)
	{
		/*for(int i=1;i<n;i++)
		{
			c+=i;
		}
		
		for(int i=c+1;i<c+n+1;i++)
		{
			op *= i;
		}*/
		
		int t=1;
		long m=0;
		int q=1;
		for(int i=0;i<n;i++)
		{
			long m1=1;
			for(int j=0;j<t;j++)
			{
				m1*=q;
				q++;
			}
			m+=m1;
			t++;
		}
		
		return m;
	}
}