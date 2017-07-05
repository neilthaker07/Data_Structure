package sortingSearching;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[]{5,19,12,2,9,222,1,11,4,7,6}; // O(nlogn) - time , O(n)-space
		
		MergeSort ms = new MergeSort();
		ms.divideInArrays(array);
	}
	
	public int[] divideInArrays(int n[])
	{
		int al1 = (n.length%2!=0) ? (n.length/2) + 1 : n.length/2;
		int al2 = n.length/2;
		
		int a1[] = new int[al1];
		int a2[] = new int[al2];
		
		for(int i=0;i<al1;i++)
		{
			a1[i] = n[i];
		}
		int al2Temp=al1;
		for(int i=0;i<al2;i++)
		{
			a2[i]=n[al2Temp];
			al2Temp++;
		}
		
		if(a1.length>1)
		{
			a1 = divideInArrays(a1);
		}
		if(a2.length>1)
		{
			a2 = divideInArrays(a2);
		}
		return compareArrayAndSort(a1, a2);
	}
	
	public int[] compareArrayAndSort(int a1[], int a2[])
	{
		TempCompare tc = new TempCompare();
		return tc.mergeSortedArrays(a1, a2);
	}	
}
