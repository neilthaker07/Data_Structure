package arraysStrings;

public class SearchInsertPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int newNum = 2;
		
		int a[] = new int[]{1,3,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==newNum || i+1==a.length || a[i+1]>newNum)
			{
				System.out.println(i);
				break;
			}
		}
		System.out.println(tree(a,0,a.length,newNum));
	}
	
	public static int tree(int[] a, int start, int end, int newNum)
	{
		int mid = (end + start) / 2;
		while(start<end)
		{
			if(mid+1<a.length && a[mid]<=newNum && a[mid+1]>newNum)
			{
				System.out.println(mid);
			}
		/*	else if(a[mid])
			{
				
			}*/
			
			
			
		}
		return 0;
		
	}
}
