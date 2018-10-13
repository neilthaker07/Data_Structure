package twilio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("/home/neil/Desktop/p1.txt"));
		StringBuilder sb = new StringBuilder();

		String line = br.readLine();
		while (line != null) {
			sb.append(line).append("\n");
			line = br.readLine();
		}
		String fileAsString = sb.toString();
		
		
		
		
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/neil/Desktop/p2.txt"));
		String content = "22222222";
		bw.write(content);
		bw.flush();
		bw.close();
	}
}
