package google;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		solution("abcd","cdabcdab");
	}
	public static int solution(String A, String B) {
        // write your code in Java SE 8
		
		int n = A.length();
		int m = B.length();
		
		if(m<n)
		{
			for(int i=0;i<n-m+1;i++)
			{
				if(A.substring(i, i+m).equals(B))
				{
					return 1;
				}
			}
			return -1;
		}
		else if(m==n)
		{
			if(A.equals(B))
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			boolean b = false;
			for(int i=0;i<m-n+1;i++)
			{
				if(B.substring(i, i+m).equals(A))
				{
					b=true;
				}
			}
			if(!b)
			{
				return -1;
			}
			char bs[] = B.toCharArray();
			char as[] = A.toCharArray();
			boolean b2 = false;
			for(int i=0;i<bs.length;i++)
			{
				for(int j=0;j<as.length;j++)
				{
					if(bs[i]==as[j])
					{
						b2 = true;
					}
				}
				if(!b2)
				{
					return -1;
				}
				b2 = false;
			}
			
			int diff = Math.abs(m - n);
			String A2 = new String(A);
			String B2 = new String(B);
			int count = 0;
			for(int i=0;i<diff;i++)
			{
				for(int j=0;j<diff+1;j++)
				{
					if((n<m && B2.substring(j, j+n).equals(A2)) || (m<=n && A2.substring(j, j+m).equals(B2)))
					{
						return count;
					}
				}
				count++;
				A2.concat(A2);
				n=A2.length();
				diff = Math.abs(m - n);
			}
		}
		return -1;
    }

}
