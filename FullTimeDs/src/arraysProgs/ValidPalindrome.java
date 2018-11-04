package arraysProgs;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(validationCheck("21 !aba1 2"));
		System.out.println(checkNum(5105));
	}
	
	public static boolean validationCheck(String a)
	{
		if(a==null)
		{
			return false;
		}
		int start =0;
		int end = a.length()-1;
		while(start<end)
		{
			while(start<end && !Character.isLetterOrDigit(a.charAt(start)))
			{
				start++;
			}
			while(start<end && !Character.isLetterOrDigit(a.charAt(end)))
			{
				end--;
			}
			
			if(a.charAt(start) != a.charAt(end))
			{
				return false;
			}
			else
			{
				start++;
				end--;
			}
		}
		return true;
	}
	
	public static boolean checkNum(int a)
	{
		int sum=0;
		int q = a;
		while(a>0)
		{
			int rem = a%10;
			sum = sum*10 + rem;
			a=a/10;
		}
		if(sum==q)
		{
			return true;
		}
		return false;
	}

}
