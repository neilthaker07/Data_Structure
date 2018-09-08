package stringProgs;

public class StringReverseProg {

	public static void main(String[] args) {
		
		String s= "quip 74";
		
		char c[] = s.toCharArray();
		
		int start = 0;
		int end = c.length-1;
		while(start<end)
		{
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			
			start++;
			end--;
		}
		
		System.out.println(String.valueOf(c));

	}

}
