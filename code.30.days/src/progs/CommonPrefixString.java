package progs;

import java.util.ArrayList;
import java.util.List;

public class CommonPrefixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList();
		list.add("acd");
		list.add("acd");
		list.add("cd");
		list.add("acd");
		list.add("asdffg");
		
		int smallestLength = Integer.MAX_VALUE;
		String smallestString = null;
		for(String g: list)
		{
			if(smallestLength > g.length())
			{
				smallestLength = g.length();
				smallestString = g;
			}
		}
		System.out.println(smallestLength);
		
		String smallestString2 = smallestString; 
		for(String g: list)
		{
			if(!g.contains(smallestString2))
			{
				smallestString2 = smallestString2.substring(0, smallestString2.length()-1);
			}
		}
		
		System.out.println("pass 1 : "+smallestString2);
		
		for(String g: list)
		{
			for(int i=smallestString2.length(); i>=0;i--)
			{
				String temp = g.substring(0, i);
				
				if(!temp.equals(smallestString2))
				{
					smallestString2 = smallestString2.substring(0, smallestString2.length()-1);
				}
				else
				{
					break;
				}
			}
		}
		
		System.out.println("pass 2 : "+smallestString2);
		
	}

}
