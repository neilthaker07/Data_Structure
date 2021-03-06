package guidewireInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Guidewire2 {

	public List<String> findAllSubStrings(String input) {
		List<String> col = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {

				col.add(input.substring(i, j));
			}
		}
		return col;
	}

	public int numberOfUniques(String str) {
		if (str.length() == 1)
			return 1;
		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}

		for (Character c : map.keySet()) {
			if (map.get(c) == 1) {
				count++;
			}
		}
		return count;
	}

	public void print(List<String> print) {
		for (String s : print) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		Guidewire2 temp = new Guidewire2();
		int totalCount = 0;
		int num = 1000000007;
		for (String str : temp.findAllSubStrings("A")) {
			int y = temp.numberOfUniques(str);
			totalCount += y%num;
			totalCount %= num;
		}
		System.out.println(totalCount);
	}
}
