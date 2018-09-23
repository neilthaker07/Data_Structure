package codingChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Harmony2 {

	public static void main(String[] args) {
		System.out.println(amaze(5));
		//primeFactors(18);

	}
	public static Long amaze(int k)
	{
		Set<Long> s = new HashSet();
		s.add((long)2);
		s.add((long)3);
		s.add((long)7);
		
		long val=2;
		long c=0;
		List<Long> al = new ArrayList<Long>();
		while(c!=k)
		{
			boolean t = true;
			if(val% 5 !=0)
			{
				Set<Long> primeFactors2 = primeFactors(val);
				
				if(primeFactors2.size()>3)
	            {
	                t = false;
	            }
	            else
	            {
	                for(Long f : primeFactors2)
	                {
	                    if(!s.contains(f))
	                    {
	                        t = false;
	                        break;
	                    }
	                }
	            }
				
				if(t)
				{
					al.add(val);
					c++;
				}
			}
			
			val++;
		}
		return al.get((int) (c-1));
	}
	
	public static Set<Long> primeFactors(Long n) 
    { 
		Set<Long> s2 = new HashSet(); 
        // Print the number of 2s that divide n 
        while (n%2==0) 
        { 
            //System.out.print(2 + " ");
            s2.add((long) 2);
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (long i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                ////System.out.print(i + " ");
                s2.add(i);
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case when 
        // n is a prime number greater than 2 
        if (n > 2) 
        {
        	s2.add(n);
        	//System.out.print(n); 
        }
        
       // System.out.println(s2);
        return s2;
    } 
          

}
