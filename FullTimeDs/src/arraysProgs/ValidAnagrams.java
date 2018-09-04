package arraysProgs;

public class ValidAnagrams {

	public static void main(String[] args) {
		
		String s1 = "anagram";
		String s2 = "nagaram"; // length must be same

		int a[] = new int[26];
		for(char c : s1.toCharArray())
		{
			a[c-'a']++;
		}
		
		for(char c: s2.toCharArray())
		{
			a[c-'a']--;
			
			if(a[c-'a']<0)
			{
				System.out.println(false);
				break;
			}
		}
		System.out.println(true);
	}
	

}
