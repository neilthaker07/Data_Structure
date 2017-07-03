package recursionDp;

public class FibRecursionTopDownMemoizationDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibRecursionTopDownMemoizationDp f = new FibRecursionTopDownMemoizationDp();
		System.out.println(f.fib(5, new int[5+1]));
	}

	public int fib(int n, int memoization[])
	{
		if(n==0 || n==1)
		{
			return n;
		}
		if(memoization[n]==0)//if value is already in array then pick it, no need to recompute
		{
			memoization[n] = fib(n-1, memoization)+fib(n-2, memoization);
		}
		return memoization[n];
	}
}
