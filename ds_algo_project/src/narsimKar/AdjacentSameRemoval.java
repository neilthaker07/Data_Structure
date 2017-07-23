package narsimKar;

import java.util.Stack;

public class AdjacentSameRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = new char[]{'m','i','s','s','i','s','s','i','p','p','i'};
		
		Stack<Character> s = new Stack<Character>();
		char temp = 0 ;
		for(int i=0;i<c.length;i++)
		{
			if(s.isEmpty() || (s.peek()!= c[i] && temp!=c[i]))
			{
				s.push(c[i]);
			}
			else
			{
				s.pop();
			}
			temp=c[i];
		}
		
		System.out.println(s);
	}

}
