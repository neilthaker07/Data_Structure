package progs;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int i2=Integer.parseInt(scan.nextLine());
        double d2=Double.parseDouble(scan.nextLine());
        String s2=scan.nextLine();
        
        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s+s2);
	}

}
