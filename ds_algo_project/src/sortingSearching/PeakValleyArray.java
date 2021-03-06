package sortingSearching;

import java.util.Arrays;

public class PeakValleyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeakValleyArray a = new PeakValleyArray();
		System.out.println(Arrays.toString(a.sort(0)));
	}
	// O(n) - optimal solution
	// O(nlogn) - not optimal - first sort then set
	int array[] = new int[]{45,40,50,30};
	public int[] sort(int start) 
	{
		for(int i=start;i<array.length;i++)
		{
			if(( i+2<array.length &&  ((array[i] >= array[i+1] && array[i+1]>=array[i+2]) ||
					(array[i] <= array[i+1] && array[i+1]<=array[i+2]) ) )) /*||
				( i+1<array.length &&  ((array[i] > array[i+1] && array[i+1]>array[i+2]) ||
					(array[i] < array[i+1] && array[i+1]<array[i+2]) ))) */
			{
				int t = array[i+2];
				array[i+2]=array[i+1];
				array[i+1] = t;
			}
		}
		return array;
	}
}
