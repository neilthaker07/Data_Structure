package firstSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		
		list.add("India");
		list.add("Switzerland");
		list.add("Italy");
		list.add("France");
		
		String [] countries = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(countries));
		
	}
	
	

}
