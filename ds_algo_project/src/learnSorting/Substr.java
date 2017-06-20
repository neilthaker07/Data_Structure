package learnSorting;

import java.util.Scanner;

public class Substr {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		System.out.println(a);
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println(a.substring(s1, s2));
		
	}

}
