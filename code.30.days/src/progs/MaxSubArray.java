package progs;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int t = a[i];
			if (t > sum) {
				sum = t;
			}
			for (int j = i + 1; j < a.length; j++) {
				t += a[j];
				if (t > sum) {
					sum = t;
				}
			}
		}
		//System.out.println(sum);

		int a1[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int n = a1.length;
		int max_sum = maxSubArraySum(a1, n);
		System.out.println("Maximum contiguous sum is " + max_sum);
	}

	static int maxSubArraySum(int a[], int size) {
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 1; i < size; i++) 
		{
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

}
