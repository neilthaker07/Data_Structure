package arraysProgs;

public class FirstMissingPositiveInt {
	
	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[]{3,2,1}));
	}

	public static int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 1;
        }
        int len = nums.length;
        int [] A = new int[len+1];
        
        for (int i=0; i<len; i++) 
        {
            if (nums[i] < 0) 
            {
                continue;
            }
            if (nums[i] <= len && A[nums[i]] == 0) 
            {
                A[nums[i]] = 1;
            }
        }
        for (int i=1; i<=len; i++) 
        {
            if (A[i] == 0) 
            {
                return i;
            }
        }
        
        return len+1;
    }
	
}
