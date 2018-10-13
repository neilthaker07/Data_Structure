package arraysProgs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class KMostFreq {

	public static void main(String[] args) {
		
		int a[] = new int[]{2,1,3,6,2,1,1};
		int k = 2;
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int a1 : a)
		{
			map.put(a1, map.getOrDefault(a1, 0) + 1);
		}
		
		List<Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());

        Map<Integer,Integer> result = new LinkedHashMap<>();
        for (Entry<Integer,Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        
		System.out.println(result);

	}

}
