package drawbridge;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(compress("aaaabbb"));
		compress("");
		
	}
	
	public static void compress(String s) {
		
		String input = "AAABBBBCC";

		int count = 1;
		char last = input.charAt(0);
		StringBuilder output = new StringBuilder();

		for (int i = 1; i < input.length(); i++) 
		{
			if (input.charAt(i) == last) 
			{
				count++;
			}
			else 
			{
				if (count > 1) 
				{
					output.append("" + last + count);
				}
				else 
				{
					output.append(last);
				}
				count = 1;
				last = input.charAt(i);
			}
		}
		if (count > 1) 
		{
			output.append("" + last + count);
		}
		else 
		{
			output.append(last);
		}
		System.out.println(output.toString());
		
		
		
		
		
		/*
		char[] chars = s.toCharArray();
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    */}

}
