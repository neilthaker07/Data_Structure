package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
	
	public static void main(String a[]) {
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}
	
	public static boolean wordPattern(String pattern, String str) {
	
		String strs[] = str.split(" ");
		if(strs.length != pattern.length())
		{
			return false;
		}
		
		Map<Character, String> map = new HashMap();
		Set<String> set = new HashSet();
		for(int i=0;i<pattern.length();i++)
		{
			char c = pattern.charAt(i);
			if(map.containsKey(c))
			{
				String temp = map.get(c);
				if(!temp.equals(strs[i]))
				{
					return false;
				}
			}
			else
			{
				if(set.contains(strs[i])) //  aaaa ,  dog cat cat dog  -> false
				{
					return false;
				}
				set.add(strs[i]);
				map.put(c, strs[i]);
			}
		}
		
		return true;
	}
}
