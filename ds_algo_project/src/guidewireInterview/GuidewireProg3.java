package guidewireInterview;

import java.util.*;

public class GuidewireProg3 {

	public static void main(String[] args) {
		//System.out.println(findMaxTime(0,1,0,0));
		System.out.println(maxTime(1,2,5,6));
	}
	
	public static String maxTime(int a, int b, int c, int d)
	{
		if(a==0 && b ==0 && c==0 && d==0)
	    {
	       return "00:00" ;
	    }
		
		String str = "" + a + b + c + d;
		char[] time = str.toCharArray(); 
		Arrays.sort(time);
		str = String.copyValueOf(time);
		
		Set<String> set = new TreeSet<String>();
		generatePermutations("",str,set);
		
		int maxTime = 0;
		for(String s : set)
		{
			if(s.matches("([01][0-9]|2[0-3])[0-5][0-9]") && maxTime < Integer.parseInt(s))
			{
				maxTime = Integer.parseInt(s);
				continue;
			}
			if(Integer.parseInt(s) > 2359)
				break;
			
		}
		
		if(maxTime == 0)
		{
			return "NOT POSSIBLE";
		}
		else
		{
			StringBuffer s1 = new StringBuffer();
			String g1 = Integer.toString(maxTime);
			if(g1.length()==1)
			{
				s1.append("0").append("0").append(":").append("0").append(g1.charAt(0));
			}
			else if(g1.length()==2)
			{
				s1.append("0").append("0").append(":").append(g1.charAt(0)).append(g1.charAt(1));
			}
			else if(g1.length()==3)
			{
				s1.append("0").append(g1.charAt(0)).append(":").append(g1.charAt(1)).append(g1.charAt(2));
			}
			else
			{
				s1.append(g1.charAt(0)).append(g1.charAt(1)).append(":").append(g1.charAt(2)).append(g1.charAt(3));
			}
			return s1.toString();
		}
			
	}
	
	private static void generatePermutations(String output, String remainder, Set<String> set)
	{
		
		int length = remainder.length();
		if(length == 0) set.add(output);
		StringBuilder ab = new StringBuilder();
		
		for(int i = 0; i < length; i++)
		{
			String before= remainder.substring(0, i);
			String after = remainder.substring(i+1, length);
			char c = remainder.charAt(i);
			generatePermutations(output+c, before+after, set);		
		}
	}
	
	public static String findMaxTime(int a, int b, int c1, int d) {
		
		String s = ""+a+b+c1+d;
		char[] carray = s.toCharArray();
		Arrays.sort(carray);
		
		if( !(Integer.parseInt(String.valueOf(carray))/100 < 24 && Integer.parseInt(String.valueOf(carray))%100 < 60))
		{
			return "NOT POSSIBLE";
		}
		
		StringBuffer output = new StringBuffer();
		if(s.indexOf('2') > -1)
		{			
			s = s.substring(0,s.indexOf('2')) + s.substring(s.indexOf('2') +1, s.length());
			output.append('2');
			System.out.println(s);
			for(int i = 3; i >= 0; i--)
			{
				if(s.indexOf(String.valueOf(i)) < 0) continue;
				s = s.substring(0,s.indexOf(String.valueOf(i))) + s.substring(s.indexOf(String.valueOf(i)) +1, s.length());
				System.out.println(s);
				output.append(i);
				break;
			}
			System.out.println(output.toString());
		}
		else
		{
			if(s.indexOf('1') > -1)
			{
				s = s.substring(0,s.indexOf('1')) + s.substring(s.indexOf('1') +1, s.length());
				output.append('1');
			}
			else
			{
				s = s.substring(0,s.indexOf('0')) + s.substring(s.indexOf('0') +1, s.length());
				output.append('0');
			}

			carray = s.toCharArray(); // Added line
			char c = carray[carray.length - 1];
			output.append(c);
			if(s.indexOf(c) > -1)
				s = s.substring(0,s.indexOf(c)) + s.substring(s.indexOf(c) +1, s.length());
		}

		output.append(":");
		for(int i = 5; i >= 0; i--)
		{
			if(s.indexOf(String.valueOf(i)) < 0) continue;
				
			s = s.substring(0,s.indexOf(String.valueOf(i))) + s.substring(s.indexOf(String.valueOf(i)) +1, s.length());
			System.out.println(s);
			output.append(i);
			break;
		}
		output.append(s);
		return output.toString();
	}

}
