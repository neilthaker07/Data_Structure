package progs;

import java.util.Scanner;

public class Solution12 {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       scan.close();
       
       AdvanceArithmetic myCalculator = new Calculator12(); 
       int sum = myCalculator.divisorSum(n);
       System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
       System.out.println(sum);
   }
}