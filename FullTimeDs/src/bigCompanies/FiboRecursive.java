package bigCompanies;

public class FiboRecursive {

	public static void main(String[] args) {
		System.out.println(fibo(9));
		System.out.println(fibo2(9));
	}
	public static int fibo(int i)
	{
		if (i==0)
			return 0;
		if (i==1)
			return 1;
		return fibo(i-1) + fibo(i-2);
	}
	
	public static int fibo2(int n)
	{
		if (n==0)
			return 0;
		if (n==1)
			return 1;
		int op1 = 0;
		int op2 = 1;
		int op=0;
		for(int i=2;i<=n;i++)
		{
			op = op1+op2;
			op1= op2;
			op2 = op;
		}
		return op;
	}
}