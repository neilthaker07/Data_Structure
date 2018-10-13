package twilio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S1 {

	public static void main(String[] args) {
		
		Map<String, String> months = new HashMap<String, String>();
		String[] mmt = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		String[] vv = new String[]{"01","02","03","04","05","06","07","08","09","10","11","12"};
		int c=0;
		for(String m : mmt)
		{
			months.put(m, vv[c]);
			c++;
		}
		
		List<String> dates = new ArrayList();
		
		List<String> output = new ArrayList<String>();
		for(String date: dates)
		{
			String[] spaces = date.split("\\s+");
			String dd = spaces[0];
			String day = dd.substring(0, dd.length() - 2);
			day = day.length() == 1 ? "0"+day : day;
			
			String mm = spaces[1];
			mm = months.get(mm);
			String yy = spaces[2];
			
			String op = yy+"-"+mm+"-"+day;
			output.add(op);
			
		}
		

	}
	
	public static List<String> reformatDate(List<String> dates) {
	    // Write your code here
	        
	    Map<String, String> months = new HashMap<String, String>();
	        String[] mmt = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	        String[] vv = new String[]{"01","02","03","04","05","06","07","08","09","10","11","12"};
	        int c=0;
	        for(String m : mmt)
	        {
	            months.put(m, vv[c]);
	            c++;
	        }
	        
	       List<String> output = new ArrayList<String>();
	        for(String date: dates)
	        {
	            String[] spaces = date.split("\\s+");
	            String dd = spaces[0];
	            String day = dd.substring(0, dd.length() - 2);
	            day = day.length() == 1 ? "0"+day : day;
	            
	            String mm = spaces[1];
	            mm = months.get(mm);
	            String yy = spaces[2];
	            
	            String op = yy+"-"+mm+"-"+day;
	            output.add(op);
	            
	        }
	        
	        return output;

	    }

}
