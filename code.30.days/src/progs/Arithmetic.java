package progs;
import java.util.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double op1 = mealCost * tipPercent/100;
        double op2 = mealCost * taxPercent/100;
        double op3 =mealCost + op1 + op2;
        
        
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(op3);
      
        System.out.println("The total meal cost is "+totalCost+" dollars.");
        // Print your result
    }
}