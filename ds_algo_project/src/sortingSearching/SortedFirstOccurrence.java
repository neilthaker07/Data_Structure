package sortingSearching;

public class SortedFirstOccurrence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[]{1,1,2,2,2,3,4,4,4,5,5,5,8};
		
		System.out.println("POSITION : "+process(array, 0, array.length-1));
	}
	static int find = 2;
	public static int process(int a[], int l ,int r)
	{
		if(l>r)
		{
			return -1;
		}
		int mid = (l+r)/2;
		if((a[mid]==find && mid==/*l*/r) || (a[mid]==find && a[mid+1]>a[mid]/*a[mid-1]<a[mid]*/))
		{
			return mid;
		}
		else if(find >= a[mid]) // for last occurrence 
		{					// for first occurrence : find > a[mid] 
			l=mid+1;
		}
		else
		{
			r=mid;
		}
		return process(a,l,r);
	}
}
