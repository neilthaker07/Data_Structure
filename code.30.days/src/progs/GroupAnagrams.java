package progs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<List<String>> groupAnagrams1(String[] strs) {
        
		List<List<String>> ans = new ArrayList();
		Map<String, List<String>> map =new HashMap();
		for(String str: strs)
		{
			char c[]= str.toCharArray();
			Arrays.sort(c);
			
			if(map.containsKey(String.valueOf(c)))
			{
				ArrayList<String> g = (ArrayList<String>) map.get(String.valueOf(c));
				g.add(str);
				map.put(String.valueOf(c), g);
			}
			else
			{
				ArrayList<String> g = new ArrayList();
				g.add(str);
				map.put(String.valueOf(c), g);
			}
		}
		ans.addAll(map.values());
		
		return ans;
    }

}
