package testString;

public class TestEqualsString {

	public static void main(String[] args) {
		
		String s1 = "b";
		String s2 = s1;
		s1 = "a";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
	}
	
}
