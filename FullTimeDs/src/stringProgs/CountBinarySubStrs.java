package stringProgs;

public class CountBinarySubStrs {

	public static void main(String[] args) {/*
		
		String s = "01111000";
		char c[] = s.toCharArray();
		int op = 0;
		
		for(int i = 0;i < c.length;i++)
		{
			int count = 0;
			
			boolean zero = false;
			boolean one = false;
			
			for(int j=i;j<c.length;j++)
			{
				char val = c[j];
				
				if(zero == false && one == false)
				{
					if(c[j]=='0')
					{
						zero = true;
					}
					else
					{
						one = true;
					}
				}
				
				if((zero && val=='0') || (one && val=='1'))
				{
					count++;
				}
				else
				{
					count--;
				}
				
				
				if((zero == true || one == true ) && count == 0)
				{
					op++;
					break;
				}
			}
		}
		
		System.out.println("output : "+op);

	*/
		String s = "0011";
		 int ans = 0, prev = 0, cur = 1;
	        for (int i = 1; i < s.length(); i++) {
	            if (s.charAt(i-1) != s.charAt(i)) {
	                ans += Math.min(prev, cur);
	                prev = cur;
	                cur = 1;
	            } else {
	                cur++;
	            }
	        }
	        System.out.println(ans + Math.min(prev, cur));	
	
	
	
	}

}
