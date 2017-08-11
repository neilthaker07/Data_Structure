package progs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			String result = isBalanced(s);
			System.out.println(result);
		}
		in.close();
	}
	
	static String isBalanced(String s) {
		// Complete this function
		Stack<Character> stack = new Stack<Character>();
		
		ArrayList<Character> start = new ArrayList<Character>();
		start.add('{');
		start.add('(');
		start.add('[');
		
		ArrayList<Character> end = new ArrayList<Character>();
		end.add('}');
		end.add(')');
		end.add(']');
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);

			if(start.contains(c))
			{
				stack.push(c);
			}
			else
			{
				if(stack.isEmpty())
				{
					return "NO";
				}
				char t = stack.pop();
				int tj1=0;
				for(int j=0;j<3;j++)
				{
					if(start.get(j) == t)
					{
						tj1 = j;
						break;
					}
				}
				if(end.get(tj1) != c)
				{
					return "NO";
				}
			}
		}
		if(!stack.isEmpty())
		{
			return "NO";
		}
		return "YES";
	}

}
