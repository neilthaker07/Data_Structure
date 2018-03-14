package progs;

import java.util.HashMap;
import java.util.Map;

public class Majority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[]{4,5,3,6,5,5,5,6,5,5};
		
		Map<Integer, Integer> map = new HashMap();
		
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], (!map.containsKey(nums[i]) ? 1 : map.get(nums[i]) + 1));
		}
		
		
		Map.Entry<Integer, Integer> maxEntry = null;

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		
		System.out.println(maxEntry.getKey());
		
	}

}
