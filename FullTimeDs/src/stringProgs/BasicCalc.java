package stringProgs;

public class BasicCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calculate("3*9-7-1-5-4"));
	}

	public static int calculate(String s) {

		String s1 = s.trim();
		s1= s1.replaceAll("\\s+","");
		
		char symbols[] = new char[]{'/','*','+','-'};
		
		for(int i=0;i<symbols.length;i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)  == symbols[i])
				{
					int val = operation(s1.charAt(j-1),s1.charAt(j+1),symbols[i]);
					
					String s2 = s1.substring(0,j-1);
					String s3 = s1.substring(j+2,s1.length());
					
					s1 = s2+val+s3;
					j=0;
				}
			}
		}
		
		return Integer.valueOf(s1);
	}
	
	public static int operation(char v11, char v22, char symbol)
	{
		int v1=Character.getNumericValue(v11);
		int v2=Character.getNumericValue(v22);
		
		if(symbol=='/')
		{
			return v1/v2;
		}
		else if(symbol=='*')
		{
			return v1*v2;
		}
		else if(symbol=='+')
		{
			return v1+v2;
		}
		else if(symbol=='-')
		{
			return v1-v2;
		}
		
		return 0;
	}

}
