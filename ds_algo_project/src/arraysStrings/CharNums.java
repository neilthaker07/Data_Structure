package arraysStrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CharNums {

	public static void main(String[] args) {
// O(n)
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		
		List op = new ArrayList();
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
			op.add(c);
			i+=c;
		}
		if(op.size()<s1.length())
		{
			Iterator i1 = op.iterator();
			while(i1.hasNext())
			{
				System.out.print(i1.next());
			}
		}
		else
		{
			System.out.println(s1);
		}
	}
}