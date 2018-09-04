package arraysProgs;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfArray {

	public static void main(String[] args) {
		
		int[] nums = new int[]{1,2,3,3,2,2,3,3,1};

		Map<Integer, Integer> pos = new HashMap();
		Map<Integer, Boolean> bool = new HashMap();
		Map<Integer, Integer> vals = new HashMap();

		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			
			if(!pos.containsKey(nums[i]))
			{
				bool.put(nums[i], false);
				pos.put(nums[i], i);
				vals.put(nums[i], 0);
			}
			else
			{
				int val = vals.get(nums[i]) + i - pos.get(nums[i]) + 1;
				
				max = max < val ? val : max;
				
				bool.put(nums[i], true);
				pos.put(nums[i], i);
				vals.put(nums[i], val);
			}
			
		}
		System.out.println(max);
	}

}
