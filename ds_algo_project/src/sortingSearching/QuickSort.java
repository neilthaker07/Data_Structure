package sortingSearching;

import java.security.AllPermission;
import java.util.Arrays;

	// after each iteration position of element gets fixed.
	// smaller element on left , bigger on right
	// O(nlogn) -avg time , o(n square) - worst time, O(1)-space
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[]{3,7,8,6,2,1,9,5,4}; 
		
		QuickSort qs = new QuickSort();
		qs.process(array);
	}
	
	public void process(int array[])
	{
		int t[] = new int[array.length]; 
		t = movePivot(array, 0, array.length-1);
	}

	int count = 0;
	int[] opArray = new int[]{1,2,3,4,5,6,7,8,9};
	private int[] movePivot(int[] array, int pivotStartPosition, int pivotEndPosition) 
	{
		//int s=array.length-1;
//		int pivotPosition = array.length-1;
		//int pivotValue = array[array.length-1];
		
		if(pivotEndPosition==0 || Arrays.toString(array).equals(Arrays.toString(opArray)))
		{
			return array;
		}
		int s=pivotEndPosition;
		
		for(int i=pivotEndPosition-1; i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(s>0 && array[j] > array[s])
				{
					int t = array[s-1];
					array[s-1] = array[j];
					array[j] = t;
					break;
				}
			}
			if(s>0 && array[s-1] > array[s])
			{
				int t = array[s-1];
				array[s-1] = array[s];
				array[s] = t;
				s--;
			//	pivotValue = array[s];
				pivotEndPosition = s;
			}
		}
		System.out.println(Arrays.toString(array));
	//	System.out.println(pivotPosition);
	//	System.out.println(pivotValue);
		
		count++;
		movePivot(array, 0, pivotEndPosition-1);
		movePivot(array, pivotEndPosition+1, array.length-1);
		return array;
	}
}
