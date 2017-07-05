package basicJava;

import java.util.Scanner;

public class PowerTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner q = new Scanner(System.in);
		int n = q.nextInt();

		System.out.println(Math.log(n));
		System.out.println(Math.log(2));
		double h = Math.log(n) / Math.log(2);
		if (Math.ceil(h) == Math.floor(h)) {
			System.out.println("TRUE");
		} else {
			System.out.println("NO");
		}
	}

}
