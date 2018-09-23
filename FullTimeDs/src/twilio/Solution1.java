package twilio;

import java.util.LinkedHashSet;

public class Solution1 {

	public static void main(String[] args) {
		
		String s[] = new String[]{"a","b","p","a","z"};
		
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++)
		{
			if(!l.contains(s[i]))
			{
				l.add(s[i]);
			}
			else
			{
				l.remove(s[i]);
			}
		}
		System.out.print(l);

	}

}
