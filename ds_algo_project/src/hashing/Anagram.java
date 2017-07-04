package hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Anagram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
        File file = new File("/home/neil/Desktop/dictionary.txt");
        Scanner input = new Scanner(System.in);
        input = new Scanner(file);

        TreeMap<String, ArrayList<String>> dictionary = new TreeMap<String, ArrayList<String>>();
        while(input.hasNextLine())
        {
        	String line = input.nextLine();
        	dictionary.put(sortCharsForKey(line), anagramWord(line));
        }
        
        Scanner word = new Scanner(System.in);
        String h = word.next();
        String qq = sortCharsForKey(h);
        System.out.println(dictionary.get(qq));
        if(dictionary.containsKey(qq))
        {
        	System.out.println("TRUE");
        }
        else
        {
        	System.out.println("FALSE");
        }
        input.close();
	}
	
	private static String sortCharsForKey(String s)
	{
		char c[] = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	private static ArrayList<String> anagramWord(String line)
	{
		ArrayList<String> temp = new ArrayList<String>();
		temp.add(line);
		return temp;
	}
}