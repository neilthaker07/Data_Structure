package bigCompanies;

import java.util.ArrayList;


public class Prog2 {

	public static void main(String[] args) {
		//System.out.println(findTargetSumWays(new int[]{1,2,3,4}, 10));
	}

	public static boolean arithmeticBoggle(int magicNumber,
			ArrayList<Integer> numbers) {
		return findTargetSums(numbers, magicNumber);
	}
	
    public static boolean findTargetSums(ArrayList<Integer> nums, int S) 
    {
        return calculate(nums, 0, 0, S);
    }
    public static boolean calculate(ArrayList<Integer> nums, int i, int sum, int S) {
    	 if (i == nums.size()) {
             if (sum == S)
                 return true;
             else
            	 return false;
         } else {
             return calculate(nums, i + 1, sum + nums.get(i), S) || calculate(nums, i + 1, sum - nums.get(i), S);
         }
    }
}
