package sortingSearching;

public class JMinusI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[] { 34,8,10,3,2,8,3,1};

		System.out.println("J - I  : " + process(array));
	}
	
	public static int process(int a[])
	{
		int t=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				if(a[j]>a[i] && j-i>t)
				{
					t=j-i;
				}
			}
		}
		return t;
	}

}
