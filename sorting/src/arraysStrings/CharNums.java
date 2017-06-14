package arraysStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharNums {

	public static void main(String[] args) {
// O(n)
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		
		List<String> op = new ArrayList<String>();
		//char[] op=new char[s1.length()*2];
		int i=0;
		while(i<s1.length())
		{
			int c = 1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					c++;
				}
				else
				{
					break;
				}
			}
			/*op[io]=s1.charAt(i);
			op[io+1]=(char)c;*/
			
			op.add(s1.charAt(i));
			op.add((char)c);
			i+=c;
		}
		if(op.size()<s1.length())
		{
			System.out.println(op);
		}
		else
		{
			System.out.println(s1);
		}
	}
}