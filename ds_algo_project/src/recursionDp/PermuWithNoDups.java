package recursionDp;

import java.util.Arrays;

public class PermuWithNoDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermuWithNoDups p = new PermuWithNoDups();
		System.out.println(Arrays.toString(p.recursion(p.a)));
	}
	String a="abc";
	public String[] recursion(String r)
	{
		if(r.length()==1)
		{
			return new String[]{r};
		}
		else
		{
			int l = r.length();
			String[] t = recursion(r.substring(0, l-1));
			
			String[] op = new String[t.length*(t[0].length()+1)];
			String c = r.substring(l-1, l);
			
			int k = 0;
			for(int i=0;i<t.length;i++)
			{
				op[k] = t[i]+c;
				k++;
				op[k] = c+t[i];
				k++;
				if(t.length > 1)
				{
					int loop = 1;
					while(loop<t[i].length())
					{
						op[k] = t[i].substring(0, loop) + c + t[i].substring(loop, t[i].length());
						k++;
						loop++;
					}
				}
			}
			return op;
		}
	}
}