package progs;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(lengthOfLastWord("hello ddd "));
		
		//System.out.println(longestCommonPrefix(new String[]{"afdf","pppppppppppppp"}));
		//System.out.println(isPalindrome("0P"));
		//System.out.println(countAndSay(5));
		System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}
	
	public static int lengthOfLastWord(String s) {
        
		String s1[] = s.split(" ");
		
		if(s1.length>0)
		{
			String op = s1[s1.length-1];
			return op.length();
		}
		return 0;
    }
	
	
	public static String longestCommonPrefix(String[] strs) {
    
		if(strs.length == 0)
		{
			return null;
		}
		int min = Integer.MAX_VALUE;
		StringBuilder smallestStr = new StringBuilder();
		for(String s : strs)
		{
			if(min > s.length())
			{
				smallestStr = new StringBuilder(s);
				min = s.length();
			}
		}
		
		int l = smallestStr.length();
		for(String s : strs)
		{
			while(!s.substring(0, l).equals(smallestStr.toString())  )
			{
				smallestStr = new StringBuilder(smallestStr.toString().substring(0, l-1));
				l--;
			}
		}
		
		return smallestStr.toString();
    }
	
	 public static int strStr(String haystack, String needle) {
		 return haystack.indexOf(needle);
	 }
	 
	 
	 public static boolean isPalindrome(String s) {
		 if(s.equals("") || s.equals(null))
		 {
			 return true;
		 }
		 s = s.replaceAll("[^a-zA-Z0-9]+", "").trim();
		 s = s.toLowerCase();
		 char c2[] = new char[s.length()/2];
		 c2 = s.substring(s.length()/2, s.length()).toCharArray();
		 
		 int l = c2.length;
		 for(char c1 : s.toCharArray())
		 {
			 if(c1!=c2[l-1])
			 {
				return false; 
			 }
			 l--;
			 if(l<=0)
			 {
				 break;
			 }
		 }
		 return true;
	 }
	 
	 
	 public static String countAndSay(int n) {
	        
		 if(n==0)
		 {
			 return "";
		 }
		 
		 int i=0;
		 StringBuilder sb = new StringBuilder("1");
		 StringBuilder sb1 = new StringBuilder("");
		 
		 while(i<n-1)
		 {
			 char c[] = sb.toString().toCharArray();
			 
			 int count = 0;
			 char temp = 0;
			 
			 for(int j=0;j<c.length;j++)
			 {
				 if(temp == 0 || c[j] == temp)
				 {
					 count++;
					 temp = c[j];
				 }
				 else
				 {
					 sb1.append(count).append(temp);
					 count = 1;
					 temp = c[j];
				 }
			 }
			 
			 if(count != 0)
			 {
				 sb1.append(count).append(temp);
			 }
			 sb.setLength(0);
			 sb.append(sb1); // whole answer
			 sb1.setLength(0); // all separate answers
			 i++;
		 }
		 
		 return sb.toString();
	 }
	 
	 public static String addBinary(String a, String b) {
/*		 int number0 = Integer.parseInt(a, 2);
		 int number1 = Integer.parseInt(b, 2);

		 int sum = number0 + number1;

		 return String.valueOf(sum);*/
		 
		 if(a == null || a.length() == 0) return b;
		 if(b == null || b.length() == 0) return a;
		        
		    StringBuilder builder = new StringBuilder();
		    int i = a.length() - 1, j = b.length() - 1, c = 0;
		         
		    while(i >= 0 || j >= 0 || c == 1) {
		        c += i >= 0 ? a.charAt(i --) - '0' : 0;
		        c += j >= 0 ? b.charAt(j --) - '0' : 0;
		            
		        builder.append((char) ('0' + c % 2));
		        c = c > 1 ? 1 : 0;
		    }
		    return builder.reverse().toString();
	 }
	 
	 public static boolean isValid(String s) {
	        
		 Stack<Character> s1 = new Stack();
		 Map<Character,Integer> open = new HashMap();
		 open.put('(',1);
		 open.put('[',2);
		 open.put('{',3);
		 
		 Map<Character,Integer> close = new HashMap();
		 close.put(')',1);
		 close.put(']',2);
		 close.put('}',3);
		 
		 char c[] = s.toCharArray();
		 for(int i=0;i<c.length;i++)
		 {
			 if(open.containsKey(c[i]))
			 {
				 s1.push(c[i]);
			 }
			 else
			 {
				if(s1.isEmpty() || close.get(c[i]) != open.get(s1.pop()))
				{
					return false;
				}
			 }
		 }
		 return s1.size() == 0 ;
	 }
	 
	 public static int firstUniqChar(String s) {
	        
		 char c[] = s.toCharArray();
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		 for(char e : c)
		 {
			 map.put(e, map.containsKey(e) ? map.get(e)+1 : 1);
		 }
		 
		 for(int i=0;i<c.length;i++)
		 {
			 if(map.get(c[i])==1)
			 {
				 return i;
			 }
		 }
		 return -1;
	 }
	 
	public boolean isPalindromeRange(String s, int i, int j) {
		for (int k = i; k <= i + (j - i) / 2; k++) {
			if (s.charAt(k) != s.charAt(j - k + i))
				return false;
		}
		return true;
	}

	public boolean validPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				int j = s.length() - 1 - i;
				return (isPalindromeRange(s, i + 1, j) || isPalindromeRange(s, i, j - 1));
			}
		}
		return true;
	}
	 
	 
}
