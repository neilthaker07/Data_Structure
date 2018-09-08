package arraysProgs;

public class SearchInsertPosition {

	public static void main(String[] args) {
		System.out.println(pos());
	}
	
	public static int pos()
	{
		int[] a= new int[]{1,3,4,5,8,9};
		int val = 6;
		int start = 0;
		int end = a.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(a[mid]==val)
			{
				return mid;
			}
			
			if(a[mid] > val)
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		return start;
	}

}
