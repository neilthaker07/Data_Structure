package arraysStrings;

public class MedianSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
		
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int l1 = nums1.length;
		int l2 = nums2.length;
		
		int pos1 = 0;
		int pos2 = 0;
		int l12 = l1+l2;
		if(l12%2 == 0)
		{
			pos2 = l12/2;
			pos1 = pos2-1;
		}
		else
		{
			pos1 = l12 / 2; 
		}
		
		
		if(l12 % 2 ==0)
		{
			int j=0;
			int k=0;
			int val1 = 0;
			int val2 = 0;
			
			for(int i=0;i<nums1.length+nums2.length;i++)
			{
				
				if(i==pos1)
				{
					val1 = nums1[i];
				}
				
				if(nums1[j] < nums2[k])
				{
					j++;
				}
				else
				{
					k++;
				}
				
				
			}
		}
		else
		{
			
		}
		
		return 0;
	}

}
