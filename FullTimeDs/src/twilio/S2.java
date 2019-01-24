package twilio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S2 {

	private static final Scanner scan = new Scanner(System.in);
    
	public static void main(String args[]) throws Exception 
	{
		// read the string filename
        String filename;
        filename = scan.nextLine();
        
        BufferedReader br = new BufferedReader(new FileReader(filename));

        String line = br.readLine();
        
        Map<String, Integer> count = new HashMap<String,Integer>();
        while (line != null) {
            //sb.append(line).append("\n");
            
            String all[] = line.split("\\s+");
            String name = all[0];
            count.put(name, count.getOrDefault(name, 0) + 1);
            
            line = br.readLine();
        }
        //String fileAsString = sb.toString();
        
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("records_"+filename));
        String content = "";
        for(Map.Entry<String, Integer> c : count.entrySet())
        {
            content+=c.getKey()+" "+c.getValue();
            content+="\n";
        }
        bw.write(content);
        bw.flush();
        bw.close();
		

	}

}
