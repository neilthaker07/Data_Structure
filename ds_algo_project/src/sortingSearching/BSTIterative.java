package sortingSearching;

public class BSTIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTRecursive b = new BSTRecursive();
		System.out.println(b.bstSearch(b.array,1,0,b.array.length-1));
	}
	
	int array[] = new int[]{1,3,6,7,8,9,10};
	
	public boolean bstSearch(int array[], int x)
	{
		int left = 0;
		int right = array.length-1;
		while(left <= right)
		{
			int mid = left + ((right-left) / 2); // or   (left + right)/2
			if(array[mid] == x)
			{
				return true;
			}
			else if(x < array[mid])
			{
				right= mid-1;
			}
			else
			{
				left = mid+1;
			}
		}
		return false;
	}

}
