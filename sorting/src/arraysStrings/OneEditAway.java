package arraysStrings;

import java.util.Scanner;

public class OneEditAway {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		System.out.println("Output : "+editCheck(s1, s2));
	}

	// O(n)
	private static boolean editCheck(String s1, String s2) {
		int count = 0;
		int l = s1.length() > s2.length() ? s2.length() : s1.length();
		
		if(s1.length()-s2.length() > 1 || s1.length()-s2.length() < -1)
		{
			return false;
		}
		int j=0;
		for(int i=0;i<l;i++)
		{
			if(s1.length()>s2.length())
			{
				if(s1.charAt(j) != s2.charAt(i))
				{
					count++;
					if(count>1)
					{
						return false;
					}
					j++;
					if(s1.charAt(j) != s2.charAt(i))
					{
						return false;
					}
				}
				j++;
			}
			if(s2.length()>s1.length())
			{
				if(s2.charAt(j) != s1.charAt(i))
				{
					count++;
					if(count>1)
					{
						return false;
					}
					j++;
					if(s2.charAt(j) != s1.charAt(i))
					{
						return false;
					}
				}
				j++;
			}
			if(s2.length()==s1.length())
			{
				if(s2.charAt(i) != s1.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				return false;
			}
		}
		return true;
	}
}
