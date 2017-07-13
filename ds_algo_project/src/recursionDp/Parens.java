package recursionDp;

import java.util.HashSet;

public class Parens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parens p = new Parens();
		System.out.println(p.process(2));
	}
	
	HashSet<String> set= new HashSet<String>();
	
	public HashSet<String> process(int remaining)
	{
		if(remaining == 0)
		{
			set.add("");
		}
		else
		{
			HashSet<String> prev = process(remaining-1);
			for(String str : prev)
			{
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i) == '(')
					{
						String s = insertInside(str, i);
						set.add(s);
					}
				}
				set.add("()"+str);
			}
		}
		return set;
	}
	
	public String insertInside(String str, int leftIndex)
	{
		String left = str.substring(0,leftIndex+1);
		String right = str.substring(leftIndex+1, str.length());
		return left + "()" +right;
	}
}
