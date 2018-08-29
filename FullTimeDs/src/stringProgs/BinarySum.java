package stringProgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BinarySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addBinary("11", "101");
		// System.out.println(validParentheses("{[}"));
		System.out.println(isPalindromeString("abcba"));
		
		System.out.println(scoreOfParentheses("()"));
	}
	
	public static int scoreOfParentheses(String S) {
	    Stack<Integer> stack = new Stack();
	    stack.push(0); // The score of the current frame

	    for (char c: S.toCharArray()) {
	        if (c == '(')
	            stack.push(0);
	        else {
	            int v = stack.pop();
	            int w = stack.pop();
	            stack.push(w + Math.max(2 * v, 1));
	        }
	    }

	    return stack.pop();
	}

	public static boolean isPalindromeString(String s) {
		
		char[] word = s.toCharArray();
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}

	public static boolean validParentheses(String s) {
		char ip[] = s.toCharArray();
		Map<Character, Character> map = new HashMap();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');

		Stack<Character> stack = new Stack<Character>();

		for (char c : ip) {
			if (map.containsKey(c)) {
				stack.add(c);
			} else {
				if (c != map.get(stack.pop())) {
					return false;
				}
			}

		}
		return stack.size() > 0 ? false : true;
	}

	public static String addBinary(String a, String b) {

		/*
		 * int number0 = Integer.parseInt(a, 2); int number1 =
		 * Integer.parseInt(b, 2);
		 * 
		 * int sum = number0 + number1; return String.valueOf(sum);
		 */

		if (a == null || a.length() == 0)
			return b;
		if (b == null || b.length() == 0)
			return a;

		StringBuilder builder = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1, c = 0;

		while (i >= 0 || j >= 0 || c == 1) {
			c += i >= 0 ? a.charAt(i--) - '0' : 0;
			c += j >= 0 ? b.charAt(j--) - '0' : 0;

			builder.append((char) ('0' + c % 2));
			c = c > 1 ? 1 : 0;
		}
		return builder.reverse().toString();
	}

}
