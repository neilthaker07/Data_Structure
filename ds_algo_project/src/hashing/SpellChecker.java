package hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

// Searching in O(1) - constant time because of hashing
public class SpellChecker {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		HashSet<String> dictionary = new HashSet<String>();
        File file = new File("/home/neil/Desktop/dictionary.txt");
        Scanner input = new Scanner(System.in);
        input = new Scanner(file);
        while(input.hasNextLine())
        {
        	String line = input.nextLine();
        	dictionary.add(line);
        }
        
        Scanner word = new Scanner(System.in);
        String h = word.next();
        
        if(dictionary.contains(h))
        {
        	System.out.println("TRUE");
        }
        else
        {
        	System.out.println("FALSE");
        }
        input.close();
	}
}