package sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	int array[] = new int[]{5,9,18,25,39,58,60,62,90};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		BinarySearch b = new BinarySearch();

		System.out.println(Arrays.toString(b.array));
		System.out.println("Binary Search from this array");
		int a = s.nextInt();
		b.searchingNo = a;
		System.out.println(b.search(b.array.length/2));
	}
	int searchingNo = 0;
	int count = 0;
	private int search(int midPosition)
	{
		count++;
		int mid = array[midPosition];
		if(count > Math.log(array.length))  // Searching never takes more than O(logN) time
		{									// So if node is not found by traversing all levels than stop searching.
			// Max is always log(Number of nodes) = level or depth of BST
			// EX : 3 levels : 0 ,1 ,2
			// Nodes are total max : 2 raise to 3 : 8
			// searching won't take more than  log 8 base 2 means 3 times comparison with every level of node.
			return 0;
		}
		if(mid==searchingNo)
		{
			return searchingNo;
		}
		else if(mid<searchingNo) 
		{
			return search( ( array.length + (midPosition+1) ) / 2 );
		}
		else if(mid>searchingNo)
		{
			return search((midPosition-1) / 2 );
		}
		else
		{
			return 0;
		}
	}
}
