package sortingSearching;

import java.util.Arrays;
// At end of each element biggest element goes to the end.
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort b = new BubbleSort();
		int array[] = new int[]{3, 0, 5, 0, 5, 5, 8};//{5,4,9,1,6,10,2,8,7,3}; // O(n square) - time , O(1)-space
		b.processBubble(array);
	}

	public void processBubble(int[] array) {
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
