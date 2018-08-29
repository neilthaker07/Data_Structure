package stringProgs;

import java.util.ArrayList;
import java.util.List;

public class PhoneNoCombine {

	public static void main(String[] args) {
		System.out.println(letterCombinations("237"));
	}

	static List<String> lst = new ArrayList<String>();

	public static List<String> addChars(String chars) 
	{
		List<String> newList = new ArrayList<String>();
		for (int i = 0; i < lst.size(); i++) {
			for (int j = 0; j < chars.length(); j++)
				newList.add(lst.get(i) + chars.charAt(j));
		}
		return newList;
	}

	public static List<String> letterCombinations(String digits) {
		if (digits.equals(""))
			return lst;
		
		String[] combos = new String[] { "", "", "abc", "def", "ghi", "jkl",
				"mno", "pqrs", "tuv", "wxyz" };
		String first = combos[Character.getNumericValue(digits.charAt(0))];
		
		for (int k = 0; k < first.length(); k++)
			lst.add(Character.toString(first.charAt(k)));
		
		for (int i = 1; i < digits.length(); i++) {
			lst = addChars(combos[Character.getNumericValue(digits.charAt(i))]);
		}
		return lst;
	}

}
