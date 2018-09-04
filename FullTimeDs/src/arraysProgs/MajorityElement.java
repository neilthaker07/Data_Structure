package arraysProgs;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(majorityElement(new int[]{2,1,2,3,3,3,2,3}));
	}
	
public static int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap();
		
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		
		Map.Entry<Integer, Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
        
        return maxEntry.getKey();
        
    }

}
