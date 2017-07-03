package recursionDp;

import java.math.BigInteger;

public class TripleStep {

	public static void main(String[] args) {

		TripleStep t = new TripleStep();
		System.out.println(t.count(37, new BigInteger[37+1]));
	}
	
	public BigInteger count(int n, BigInteger i[])
	{
		if(n<0)
		{
			return BigInteger.ZERO;
		}
		if(n==0 || n==1)
		{
			return BigInteger.ONE;
		}
		if(n==2)
		{
			return new BigInteger("2");
		}
		if(n==3)
		{
			return new BigInteger("4");
		}
		if(i[n]==null)
		{
			i[n]=count(n-1,i).add(count(n-2, i)).add(count(n-3, i));
		}
		return i[n];
	}
}