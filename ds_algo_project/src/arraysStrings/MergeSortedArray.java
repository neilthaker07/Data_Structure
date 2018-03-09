package arraysStrings;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1[] = new int[2];
		int a2[] = new int[]{2};
		a1[0]=1;
		/*a1[1]=5;
		a1[2]=8;
		a1[3]=9;*/
		merge(a1, 1,a2, 1);
		for(int i = 0; i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
	}
	
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

		
		if(m==0)
		{
			for(int i = 0; i<nums2.length;i++)
			{
				nums1[i]=nums2[i];
			}
		}
		if(n==0)
		{
			for(int i = 0; i<nums2.length;i++)
			{
				nums2[i]=nums1[i];
			}
		}
		else
		{
			
			if(m>0){
				m--;
			}
			if(n>0){
				n--;
			}

			int i = nums1.length - 1;
			for (i = nums1.length - 1; i >= 0; i--) {
				if(m>=0 && n>=0)
				{
					if (nums1[m] > nums2[n]) {
						nums1[i] = nums1[m];
						m--;
					} else {
						nums1[i] = nums2[n];
						n--;
					}
				}
				else
				{
					break;
				}
				
			}
			
			
			while(n>=0)
             {
                 nums1[i]=nums2[n];
                 i--;
                 n--;
             }
			
		}
		
		return nums1;

	}

}
