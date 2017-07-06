package sortingSearching;

import java.util.Arrays;

public class RadixSort {
 // Sorting is done from least to most significant digits. and digits sorting any algo is used.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[]{53, 10, 25, 90,808088,9, 2222, 105, 45};
		RadixSort qs = new RadixSort();
		qs.sortRadixProcess(array);
	}

	public void sortRadixProcess(int array[])
	{
		int tArray[] = new int[array.length]; 
		for(int i=0;i<array.length;i++)
		{
			tArray[i] = array[i];
		}
		int loopDigits = determineMaxDigit(tArray);
		System.out.println(loopDigits);

		int d=1; // divide by or divisor
		int m=10; // modulo
		for(int i=0;i<loopDigits;i++)
		{
			for(int k=0;k<array.length;k++)
			{
				for(int j=0;j<array.length;j++)
				{
					if(j+1<array.length && (array[j]/d) % m > (array[j+1]/d) % m)
					{
						int t = array[j];
						array[j] = array[j+1];
						array[j+1] = t;
					}
				}
			}
			d*=10;
		}
		System.out.println(Arrays.toString(array));
	}

	private int determineMaxDigit(int[] tempArray) {
		int loopDigit=0;
		int tempDigit = 0;
		for(int i=0;i< tempArray.length;i++)
		{
			while(tempArray[i]/10 > 0)
			{
				loopDigit++;
				tempArray[i] = tempArray[i]/10;
			}
			if(tempDigit < loopDigit+1)
			{
				tempDigit = loopDigit+1;
			}
			loopDigit = 0;
		}
		return tempDigit;
	}
}