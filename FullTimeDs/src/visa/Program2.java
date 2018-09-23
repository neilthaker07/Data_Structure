package visa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int deleteProducts(List<Integer> ids, int m) 
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int id : ids) {
			map.put(id, map.getOrDefault(id, 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());

		Map<Integer, Integer> result = new LinkedHashMap<>();
		for (Map.Entry<Integer, Integer> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}

		int output = result.size();
		for (Map.Entry<Integer, Integer> each : result.entrySet()) {
			if (m > 0) {
				if (each.getValue() <= m) {
					output = output - 1;
					m = m - each.getValue();
				} else {
					break;
				}
			} else {
				break;
			}
		}

		return output;
	}

}
