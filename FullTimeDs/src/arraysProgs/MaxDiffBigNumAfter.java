package arraysProgs;

public class MaxDiffBigNumAfter {

	static int maxDiff(int arr[], int arr_size) {
		int max_diff = arr[1] - arr[0];
		int min_element = arr[0];
		for (int i = 1; i < arr_size; i++) 
		{
			if (arr[i] - min_element > max_diff)
				max_diff = arr[i] - min_element;
			if (arr[i] < min_element)
				min_element = arr[i];
		}
		return max_diff;
	}

	public static void main(String[] args) {
		int arr[] = { 6,3,1};
		int size = arr.length;
		System.out.println("MaximumDifference is " + maxDiff(arr, size));
	}

}
