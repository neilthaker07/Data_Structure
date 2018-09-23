package stringProgs;

// longest Palindrome substring
public class LongestSubstring {

	public static void main(String[] args) {
		
		String a="abipbl";//"abaqrm";//"cbca";
		
		char[] c = a.toCharArray();
		
		
		int start = 0;
		int end = c.length-1;
		int op = end-start+1;
		
		while(start<end)
		{
			if(c[start]!=c[end])
			{
				op=op-1;
				op=op-1;
				start++;
				end--;
			}
			else
			{
				while(start<end)
				{
					if(c[start]!=c[end])
					{
						op=op-1;
						op=op-1;
						start++;
						end--;
						break;
					}
					start++;
					end--;
				}
			}
			
		}
		
		System.out.println(op);
		

	}

}
