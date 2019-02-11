package bigCompanies;

import java.util.HashMap;
import java.util.Map;

public class Abc {
	private Map<String, Integer> map;

	public Abc() {
		map = new HashMap<>();
		map.put("foo", 1);
		map.put("bar", 3);
	}

	public int getValue(String input, int numRetries) throws Exception {
		try {
			System.out.println("called");
			return map.get(input);
		} catch (Exception e) {
			if (numRetries > 3) {
				throw e;
			}
			return getValue(input, numRetries + 1);
		}
	}
	public static void main(String[] args) throws Exception {
		Abc aa = new Abc();
		/*aa.getValue("foo", 0);
		aa.getValue("bar", 2);*/
		//aa.getValue("baz", 0);
		//aa.getValue("fubar", 1);
	}
}
/*
 * Question: How many times will 'getValue(…)' execute with the following
 * inputs, and what will be the result?
 * 
 * (1) getValue("foo", 0); 1 
 * (2) getValue("bar", 2); 1
 * (3) getValue("baz", 0); 1+  1->2->3->4
 * (4) getValue("fubar", 1); 1+  2->3->4
 */