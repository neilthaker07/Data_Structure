package sortingSearching;

import java.util.Arrays;

public class SelectionSort {
// find smallest element from array and replace it with first element and so on.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelectionSort p = new SelectionSort();
		
		int array[] = new int[]{5,4,9,1,6,10,2,8,7,3}; // O(n square) - time , O(1)-space
		p.processSortingSelection(array);
	}

	public int[] processSortingSelection(int array[]) {
		
		for(int i=0;i<array.length;i++)
		{
			int temp=0;
			int loc = 0;
			for(int j=i+1;j<array.length;j++)
			{
				if(j<array.length)  
				{
					if(temp==0)
					{
						if( array[i] > array[j])
						{
							temp = array[j];
							loc=j;
						}
					}
					else if(temp > array[j])
					{
						temp = array[j];
						loc=j;
					}
				}
			}
			if(temp>0)
			{
				array[loc] = array[i];
				array[i] = temp;
			}
		}
		System.out.println(Arrays.toString(array));
		return array;
	}
}
