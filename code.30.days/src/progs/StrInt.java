package progs;

import java.util.Scanner;

public class StrInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String s = in.next();

		try {
			System.out.println(Integer.parseInt(s));
		} catch (Exception e) {
			System.out.println("Bad String");
		}

	}

}
