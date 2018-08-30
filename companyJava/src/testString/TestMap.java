package testString;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Integer> map = new HashMap();
		map.put("a",4);
		
		map.put("a",map.getOrDefault("a", 0) + 1);
		
		System.out.println(map);
	}

}
