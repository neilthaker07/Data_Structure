package narsimKar;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{1,2,3,4,5};
		process(array, 0);
	}
	
	public static void process(int a[], int mid)
	{
		System.out.println(function(0, a.length-1, a, 4));
	}
	public static int function(int left, int right, int a[], int n)
	{
		int mid = (left + right ) / 2;
		if(a[mid] == n)
		{
			return n;
		}
		else
		{
			if(n>a[mid])
			{
				return function(mid+1, right, a, n);
			}
			else
			{
				return function(left, mid-1, a, n);
			}
		}
	}
}
