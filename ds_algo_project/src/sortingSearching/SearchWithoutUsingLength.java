package sortingSearching;

public class SearchWithoutUsingLength {
	int search = 9;
	public static void main(String aop[])
	{
		int array[] = new int[]{1,3,4,5,7,8};
		int arraySize=0;
		int output= 0;
		while(output!=-1)
		{
			if(arraySize==6) // in custom Data structure element at method is there which returns -1.
			{
				output=-1;
			}
			else
			{
				output = array[arraySize];
				arraySize++;
			}
		}
		System.out.println("Size of array : "+arraySize);
		
		SearchWithoutUsingLength qq = new SearchWithoutUsingLength();
		qq.size = arraySize;
		System.out.println(qq.binarySearch(0,arraySize-1, array));
	}
	int size = 0;
	int count = 0;
	private int binarySearch(int start, int end, int[] array) 
	{
		if(count > Math.log(size))
		{
			return -1;
		}
		else
		{
			int mid = (start+end)%2!= 0 ? ((start+end)/2)+1 : (start+end)/2;
			count++;
			if(array[mid]==search)
			{
				return mid;
			}
			else if(search < array[mid])
			{
				return binarySearch(start, mid-1, array);
			}
			else
			{
				return binarySearch(mid+1, end, array);
			}
		}
	}
}
