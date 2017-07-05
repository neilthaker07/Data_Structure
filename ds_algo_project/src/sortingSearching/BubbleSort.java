package sortingSearching;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[]{5,4,9,1,6,10,2,8,7,3}; // O(n square) - time , O(1)-space
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(j+1<array.length && array[j] > array[j+1])
				{
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
