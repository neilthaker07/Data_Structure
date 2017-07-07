package sortingSearching;

public class RotatedSortedArraySearch {

	static int searchingElement = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{3,4,5,6,7,8,9,10,1,2};
		
		System.out.println(sorting(array));
	}

	private static int sorting(int[] array) 
	{
		int midPosition = array.length%2!=0 ? (array.length/2) + 1 : array.length/2;
		int midValue = array[midPosition];
		for(int i=0;i<array.length;i++)
		{
			if(midValue == searchingElement)
			{
				return midPosition;
			}
			//if(midValue > start)
			{
				// left is sorted
				if(searchingElement < midValue)
				{
					int l = array.length%2!=0 ? (array.length/2) + 1 : array.length/2;
					int halfArray[] = new int[l];
					for(int j=0;j<l;j++)
					{
						halfArray[j] = array[j];
					}
					sorting(halfArray);
				}
				else
				{
					int halfArray[] = new int[array.length%2!=0 ? (array.length/2) + 1 : array.length/2];
					for(int j=(array.length/2);j<array.length;j++)
					{
						halfArray[j] = array[j];
					}
					sorting(halfArray);
				}
			}
			//else if(midValue < start)
			{
				// right is sorted
			}
		}
		//return 0;
		return midPosition;
	}
}
