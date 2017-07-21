package progs;

import java.util.Scanner;

public interface AdvanceArithmetic {
	int divisorSum(int n);
}

class Calculator12 implements AdvanceArithmetic
{
	public int divisorSum(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum += (n%i==0) ? i : 0;
		}
		return sum;
	}
}
