package sortingSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramNextToEachOtherHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1 = new String[]{"keymon","zebra","happy","paphy","arbez","monkey"};
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i] != null)
			{
				char c1[] = s1[i].toCharArray();
				Arrays.sort(c1);
				String t1 = new String(c1);
				
				ArrayList<String> temp = new ArrayList<String>();
				temp.add(s1[i]);
				for(int j=i+1;j<s1.length;j++)
				{
					if(s1[j]!=null)
					{
						char c2[] = s1[j].toCharArray();
						Arrays.sort(c2);
						String t2 = new String(c2);
						if(t1.equals(t2))
						{
							temp.add(s1[j]);
							s1[j] = null;
						}
					}
				}
				map.put(t1, temp);
			}
		}
		System.out.println(map.values().toString());
	}
}
