package progs;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(searchElement(new int[]{1,2,3,5,7,8,9,12,14,16}, 1));

	}
	
	public static int searchElement(int[] a, int s)
	{
		int l = a.length;
		int start = 0;
		int end = a.length-1;
		
		while(start <= end)
		{
			int mid = (start + end) / 2;
			
			if(a[mid]==s)
			{
				return mid;
			}
			
			if(s > a[mid])
			{
				start = mid+1;
			}
			else
			{
				end  = mid-1;
			}
			
		}
		return -1;
	}

}
