package progs;

import java.util.Scanner;
public class Avg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();
		Student11 s = new Student11(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}

class Person11 {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person11(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
}

class Student11 extends Person11{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	Student11(String firstName, String lastName, int identification, int[] testScores)
	{
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public char calculate()
	{
		int sum =0;  
		for(int i=0;i<testScores.length;i++)
		{
			sum+=testScores[i];
		}
		int avg = sum / testScores.length;
		
		if(avg<40)
		{
			return 'T';
		}
		else if(avg>=40 && avg <55)
		{
			return 'D';
		}
		else if(avg>=5 && avg <70)
		{
			return 'P';
		}
		else if(avg>=70 && avg <80)
		{
			return 'A';
		}
		else if(avg>=80 && avg <90)
		{
			return 'E';
		}
		else/* if(avg>=90 && avg <=100)*/
		{
			return 'O';
		}
	}
}




