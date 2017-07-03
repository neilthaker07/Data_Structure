package recursionDp;

public class FibRecursionBottomUpDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibRecursionBottomUpDp f = new FibRecursionBottomUpDp();
		System.out.println(f.fib(6));
	}

	public int fib(int n)
	{
		int a=0;
		int b=1;
		for(int i=2;i<n;i++)
		{
			int c = a+b;
			a=b;
			b=c;
		}
		return a+b;
	}
}