package sortingSearching;

import java.util.Arrays;

public class AnagramNextToEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1 = new String[]{"keymon","zebra","happy","paphy","arbez","monkey"};
		String s2[] = new String[s1.length];
		
		int counter=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=null)
			{
				char c1[] = s1[i].toCharArray();
				Arrays.sort(c1);
				String t1 = new String(c1);
				
				s2[counter] = s1[i];
				counter++;
	
				for(int j=i+1;j<s1.length;j++)
				{
					if(s1[j]!=null)
					{
						char c2[] = s1[j].toCharArray();
						Arrays.sort(c2);
						String t2 = new String(c2);
						if(t1.equals(t2))
						{
							s2[counter] = s1[j];
							counter++;
							s1[j] = null;
						}
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(s2));
	}
}