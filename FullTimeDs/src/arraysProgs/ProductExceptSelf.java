package arraysProgs;

import java.util.Arrays;

public class ProductExceptSelf {

	public static void main(String[] args) {
		
		int[] nums = new int[]{1,2,3,4};
		int[] res = new int[nums.length];

        res[0] = 1;
        for(int i=1; i < nums.length; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        for(int j = nums.length - 1; j > 0; j--) {
            res[j] *= res[0];
            res[0] *= nums[j];
        }
        
        System.out.println(Arrays.toString(res));

	}

}
