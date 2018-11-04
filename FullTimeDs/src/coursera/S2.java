package coursera;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ip = new ArrayList<Integer>();
		//ip.add(5);
		ip.add(5);
		ip.add(6);
		ip.add(8);
		ip.add(8);
		ip.add(5);
		/*ip.add(3);
		ip.add(3);
		ip.add(2);
		ip.add(3);*/
		System.out.println(countMoves1(ip));
	
	}
	
	public static long countMoves1(List<Integer> nums) {
		
	/*	int arraySum, smallest, arr_size = numbers.size(); 
        arraySum = 0; 
        smallest = numbers.get(1); 
        for (int i = 1; i < arr_size ; i++) 
        { 
             If current element is smaller than  
               update smallest 
            if (numbers.get(i) < smallest)             
                smallest = numbers.get(i);             
   
            find array sum 
            arraySum += numbers.get(i); 
        } 
  
        int minOperation = arraySum - (arr_size * smallest);
        return minOperation;*/
		
		
		/*int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int k = 0;k<numbers.size();k++)
        {
            int x = numbers.get(k);
            sum += x;
            if (x < min) {
                min = x;
            }
        }

        return sum - min * numbers.size();*/
		return 0;
	}
	
	 public static long countMoves(List<Integer> numbers) {
		 if(numbers.size()==0 || numbers.size()==2)
		 {
			 return 0;
		 }
		 
		 boolean allSame = false;
		 long count = 0;
		 
		 while(!allSame)
		 {
			 int maxIndex = findMaxIndex(numbers);
			 if(checkIfAllSame(numbers))
			 {
				 break;
			 }
			 increment(numbers, maxIndex);
			 count++;
		 }
		 
		 return count;
    }
	 public static boolean checkIfAllSame(List<Integer> nums)
	 {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 1; i < nums.size(); i++) 
		{
			set.add(nums.get(i));
		}
		return set.size() == 1;
	 }
	 
	public static int findMaxIndex(List<Integer> nums)
	{
		int max = Integer.MIN_VALUE;
		int j = 1;
		for(int i=1;i<nums.size() ; i++)
		{
			if(max<nums.get(i))
			{
				max = nums.get(i);
				j=i;
			}
		}
		return j;
	}
	
	public static List<Integer> increment(List<Integer> nums, int maxIndex)
	{
		for(int i=1;i<nums.size();i++)
		{
			if(i!=maxIndex)
			{
				nums.set(i, nums.get(i)+1);
			}
		}
		return nums;
	}
	 

}
