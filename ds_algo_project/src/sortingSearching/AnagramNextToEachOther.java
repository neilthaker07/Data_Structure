package sortingSearching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AnagramNextToEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s = new String[]{"keymon","zebra","happy","paphy","arbez","monkey"};
		Set<String> set = new HashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			char c[] = s[i].toCharArray();
			Arrays.sort(c);
			set.add(new String(c));
		}
		System.out.println(set);
		String s1[] = new String[s.length];
		int loc=0;
		for(int i=0;i<s.length;i++)
		{
			char c[] = s[i].toCharArray();
			Arrays.sort(c);
			String t = new String(c);
			if(set.contains(t))
			{
				s1[loc]=s[i];
				loc++;
				s1[loc]=t;
				loc++;
			}
			else
			{
				s1[loc] = t;
			}
		}
		System.out.println(s1);
	}
}