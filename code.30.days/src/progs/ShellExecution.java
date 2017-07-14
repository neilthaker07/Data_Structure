package progs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShellExecution {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String command = "sh /home/neil/Neil_Work/MS_SJSU/java_practice/Data_Structure/code.30.days/src/progs/test.sh";

		StringBuffer output = new StringBuffer();
		Process p = Runtime.getRuntime().exec(command);
		p.waitFor();
		BufferedReader reader =
                        new BufferedReader(new InputStreamReader(p.getInputStream()));

                    String line = "";
		while ((line = reader.readLine())!= null) {
			output.append(line + "\n");
		}
		System.out.println(output);
		
	}
}
