package narsimKar;

public class Ch2No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch2No2 p = new Ch2No2();
		System.out.println(p.process(p.array, p.array.length));
	}

	int array[] = new int[]{1,2,3,8,9};

	public boolean process(int a[], int n)
	{
		if(n-2 < 0)
		{
			return true;
		}
		if(a[n-1] < a[n-2])
		{
			return false;
		}
		return process(a, n-1);
	}
	
}
