package narsimKar;

public class BSIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{1,2,3,4,5};
		process(array, 1);
	}

	public static void process(int a[], int n)
	{
		int left = 0;
		int right = a.length -1;
		while(left<=right)
		{
			int mid = (left + right) / 2; 
			if(a[mid] == n)
			{
				System.out.println(n);
				break;
			}
			else if(n>a[mid])
			{
				left = mid+1;
			}
			else
			{
				right = mid-1;
			}
		}
	}
	
}
