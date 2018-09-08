package stringProgs;

public class LongestSubstring {

	public static void main(String[] args) {
		
		String a="cbca";
		char[] c = a.toCharArray();
		
		int op = c.length;
		
		int start = 0;
		int end = c.length-1;
		
		while(start<end)
		{
			if(c[start]!=c[end])
			{
				op=op-1;
				//start++;
				end--;
			}
			else
			{
				while(start<end)
				{
					if(c[start]!=c[end])
					{
						//start++;
						end--;
						break;
					}
					//start++;
					end--;
				}
			}
			
		}
		
		System.out.println(op);
		

	}

}
