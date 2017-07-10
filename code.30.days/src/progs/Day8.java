package progs;

//Complete this code or write your own from scratch
import java.util.*;

public class Day8 {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			map.put(name, phone);
		}
		int m = 0;
		String list[] = new String[n]; 
		
		while (m<n && in.hasNext()) {
			String s = in.next();
			list[m]=s;
			m++;
		}
		
		for(int i=0;i<m;i++)
		{
			System.out.println(map.get(list[i])!=null ? list[i]+"="+map.get(list[i]) : "Not found"); 
		}
		in.close();
	}
}
