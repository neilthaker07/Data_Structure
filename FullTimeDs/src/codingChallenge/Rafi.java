package codingChallenge;

public class Rafi {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{5,4,0,3,1,6,2}));
	}
	
	public static int solution(int a[])
	{
		if(a==null || a.length==0)
		{
			return 0;
		}
		
		int l=a.length;
		int i=0;
		boolean visited[] = new boolean[l];
		int max = 0;
		
		while(i<l)
		{
			int j = i;
			int count = 0;
			while(!visited[j])
			{
				count++;
				visited[j] = true;
				j = a[j];
			}
			max = Math.max(max, count);
			i++;
		}
		return max;
	}

}
