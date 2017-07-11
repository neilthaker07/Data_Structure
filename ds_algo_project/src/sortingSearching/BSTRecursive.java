package sortingSearching;

public class BSTRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BSTRecursive b = new BSTRecursive();
		System.out.println(b.bstSearch(b.array,1,0,b.array.length-1));
	}
	
	int array[] = new int[]{1,3,6,7,8,9,10};
	
	public boolean bstSearch(int array[], int x, int left, int right)
	{
		if(left > right)
		{
			return false;
		}
		
		int mid = left + ((right-left) / 2); // or   (left + right)/2
		if(array[mid] == x)
		{
			return true;
		}
		else if(x < array[mid])
		{
			return bstSearch(array, x, left, mid-1);
		}
		else
		{
			return bstSearch(array, x, mid+1, right);
		}
	}

}
