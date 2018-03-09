package arraysStrings;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = new int[]{3,5,1,2,8};

		int target = 45;
		int r[]= new int[2];
		
		Map<Integer, Integer> a1 = new HashMap<Integer, Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			a1.put(ar[i],ar[i]);
			/*int search = target - ar[i];
			r[0]=ar[i];
			for(int j=i+1;j<ar.length;j++)
			{
				if(search==ar[j])
				{
					r[1]=ar[j];
					System.out.println(r[0]+" "+r[1]);
				}
			}*/
		}
		
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < ar.length; i++) {
	        int complement = target - ar[i];
	        
	        if (map.containsKey(complement)) {
	        //    return new int[] { map.get(complement), i };
	        	
	        }
	        map.put(ar[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
		
		
		
		
		
		
		
		
	}

}
