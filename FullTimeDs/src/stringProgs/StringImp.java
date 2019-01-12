package stringProgs;

import java.util.ArrayList;
import java.util.List;

public class StringImp {

	public static void main(String[] args) {
		List<Integer> l = getStartingPoints("abab", "ab");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
	
	static List<Integer> getStartingPoints(String s1, String s2)
	{
		int ms1[]=new int[256];
		int ms2[]=new int[256];
		for(char c:s2.toCharArray())
		{
			ms2[c]++;
		}
		int j=0;
		int targetLength = s2.length();
		List<Integer> ans = new ArrayList(); 
		for(int i=0;i<s1.length();i++)
		{
			while(j<s1.length() && !helper(ms1, ms2) && (j-i)<=targetLength)
			{
				ms1[s1.charAt(j)]++;
				j++;
			}
			
			if(helper(ms1, ms2))
			{
				ans.add(i);
			}
			ms1[s1.charAt(i)]--;
		}
		return ans;
	}
	
	static boolean helper(int s1[], int s2[])
	{
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i] != s1[i])
			{
				return false;
			}
		}
		return true;
	}
}
