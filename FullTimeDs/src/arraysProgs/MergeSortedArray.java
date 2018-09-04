package arraysProgs;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int nums1[] = new int[]{4,5,6,0,0,0};
		int nums2[] = new int[]{1,2,3};
		int m = 3;
		int n = 3;
		n--;
		m--;
		
		int p1 = nums1.length -1;
		
		while(m>=0 && n>=0)
		{
			if(nums2[n] >= nums1[m] )
			{
				nums1[p1] = nums2[n];
				n--;
				
			}
			else
			{
				nums1[p1] = nums1[m];
				nums1[m] = 0;
				m--;
			}
			p1--;
		}
		
		while(n>=0)
		{
			nums1[n] = nums2[n];
			n--;
		}
		
		
		for(int i=0;i<nums1.length;i++)
		{
			System.out.print(nums1[i]+" ");
		}

	}

}
