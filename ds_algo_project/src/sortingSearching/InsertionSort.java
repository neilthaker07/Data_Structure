package sortingSearching;

import java.util.Arrays;

public class InsertionSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertionSort a = new InsertionSort();
		a.sort();
	}

	int[] array = new int[]{9,8,7,6,5,4,3,2,1,};
	public void sort()
	{
		for(int i=0;i<array.length ; i++)
		{
			boolean flag = false;
			int temp = array[i];
			for(int j=i-1;j>=0;j--)
			{
				if(temp<array[j])
				{
					array[j+1]=array[j];
					flag=true;
				}
				else
				{
					if(flag==true)
					{
						array[j+1] = temp;
						flag = false;
						break;
					}
					else
					{
						break;
					}
				}
			}

			if(flag==true)
			{
				array[0] = temp;
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
