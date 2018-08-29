package stringProgs;

public class ToLowerCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "ABCZ";
		
		char x[] = a.toCharArray();
		
		for(int i=0;i<x.length;i++)
		{
			if((int)x[i]<=90 && (int)x[i]>=65)
			{
				int t = (int)x[i];
				x[i] = (char) (t+32);
			}
		}
		
		System.out.println(String.valueOf(x));
	}
	

}
