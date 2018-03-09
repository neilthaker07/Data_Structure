package arraysStrings;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 2;
		int nums[] = new int[]{1,2,3,4,5,6}; 

		k %= nums.length;
		nums = reverse(nums, 0, nums.length-1);
        nums = reverse(nums, 0, k-1);
        nums = reverse(nums, k, nums.length-1);
        
        for(int i=0;i<nums.length ; i++)
        {
        	System.out.print(nums[i]+" ");        	
        }
        
	}
	public static int[] reverse(int[] qa, int start , int end)
    {
        while(start<end)
        {
            int temp = qa[start];
            qa[start] = qa[end];
            qa[end] = temp;
            start++;
            end--;
        }
        
        return qa;
        
    }

}
