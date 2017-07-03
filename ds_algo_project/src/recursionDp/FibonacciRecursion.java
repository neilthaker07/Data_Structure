package recursionDp;

public class FibonacciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonacciRecursion f = new FibonacciRecursion();
		System.out.println(f.fib(6));
	}
	
	public int fib(int n)
	{
		if(n==0 || n==1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2); 
	}
}
