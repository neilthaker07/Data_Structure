package googleK;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String time = "22:00";
		int hour = Integer.parseInt(time.substring(0, 2));
		int min = Integer.parseInt(time.substring(3, 5));
		
		Map<Character, Integer> map = new HashMap<>();
		
		while (true) {
			for(char c: time.toCharArray())
			{
				//if(c!='!')
				{
					map.put( c,map.getOrDefault(c, 0) + 1);
				}
			}
			
			if (++min == 60) {
				min = 0;
				++hour;
				hour %= 24;
			}
			String curr = String.format("%02d:%02d", hour, min);
			Boolean valid = true;
			for (int i = 0; i < curr.length(); ++i)
			{
				if (time.indexOf(curr.charAt(i)) < 0) {
					valid = false;
					break;
				}
				else
				{
					if(!map.containsKey(curr.charAt(i)))
					{
						valid = false;
						break;
					}
					map.put( curr.charAt(i), map.get(curr.charAt(i)) -1);
					if(map.get(curr.charAt(i)) == 0)
					{
						map.remove( curr.charAt(i));
					}
				}
			}
			
			if (valid & map.size()==0)
			{
				System.out.println(curr);
				break;
			}
			map.clear();
		}
	}
}
