package sortingSearching;

public class BitonicArraySearchUpDown {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[]{8,9,6,5,4,3,2};
		
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
		if(a[mid]==find)
		{
			return mid;
		}
		else if(a[l]<=a[mid])
		{
			if(find >= a[l] && find<a[mid])
			{
				r = mid-1;
			}
			else
			{
				l = mid+1;
			}
		}
		else
		{
			if(find<a[mid] && a[r]<=find)
			{
				l=mid+1;
			}
			else
			{
				r = mid-1;
			}
		}
		return process(a, l, r);
	}
}
