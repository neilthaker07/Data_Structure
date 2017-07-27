package hashing;

import java.util.Hashtable;

public class RemoveDups {

	char array[] = new char[]{'a','g','w','q','p','l','o'};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDups a = new RemoveDups();
		a.process();
	}
	
	public void process()
	{
		Hashtable<Character, Integer> hashing = new Hashtable<Character, Integer>();
		for(char q : array)
		{
			if(hashing.containsKey(q))
			{
				System.out.println("BANG : " + q);
				break;
			}
			hashing.put(q, 1);
		}
		
	}
}
