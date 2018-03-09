package progs;

import java.util.LinkedList;

public class WePay {

	public static void main(String[] args) {
		
		
		/*System.out.println(method(new double[]{100,100,100,100,100,100,100,100}, 2,1.5));
		System.out.println(method(new double[]{1,1,1,200,200,1,1,1}, 2,1.5));
		System.out.println(method(new double[]{1,2,100,2,2},3,1.5));
		System.out.println(method(new double[]{4,2,2},3,2));
		System.out.println(method(new double[]{1,2,100,2,2},2,2.5));
		*/
		//maxPrint();
		//System.out.println(try2(new double[]{1,2,100,2,2}, 3,1.5));
		//try2(new double[]{1,2,100,2,2}, 3,1.5);
		
		System.out.println(try2(new int[]{100,100,100,100,100,100,100,100}, 2,1.5));
		System.out.println(try2(new int[]{1,1,1,200,200,1,1,1}, 2,1.5));
		System.out.println(try2(new int[]{1,2,100,2,2},3,1.5));
		System.out.println(try2(new int[]{4,2,2},3,2));
		System.out.println(try2(new int[]{1,2,100,2,2},2,2.5));
		System.out.println(try2(new int[]{},2,2.5));
		
	}

	public static boolean method(double inputs[], int windowSize, double allowedIncrease)
	{
		//double avgArray[] = new double[a.length-window+1];
		//int counter = 0;
		double prevAvg = Double.MAX_VALUE;
		
		for(int i=0;i<inputs.length; i++)
		{
			if( windowSize+i <= inputs.length )
			{
				double sum = 0;
				double max = Double.MIN_VALUE;
				
				//outerSum = outerSum + a[window+i-1];
				for(int j=i;j<windowSize+i;j++)
				{
					sum += inputs[j];
					max = inputs[j] > max ? inputs[j] : max;
				}
				
				double avg = sum / windowSize;
				//double avg = outerSum / window;
				double mul = avg * allowedIncrease;
				
				if(max > mul)
				{
					return true;
				}
				
				if(prevAvg * allowedIncrease < avg)
				{
					return true;
				}
				prevAvg = avg;
				//outerSum = sum - a[i];
				
				/*avgArray[counter] = avg; 
				counter++;*/
			}
		}
		
		/*for(int i=0;i<avgArray.length;i++)
		{
			if(avgArray[i] * d < avgArray[i+1])
			{
				return true;
			}
		}*/
		return false;
	}
	
	public static boolean try2(int inputs[], int windowSize, double allowedIncrease)
	{
		double prevAvg = Double.MAX_VALUE;
		double outerSum = 0;
		double max = Double.MIN_VALUE;
		double avg = 0;
		int minPosToRemove = 0;
		int[] pl= maxPrint(inputs, windowSize);
		
		for(int i=0;i<inputs.length; i++)
		{
			if( windowSize+i <= inputs.length )
			{
				outerSum = outerSum + inputs[i];
				
				if( i+1 >= windowSize )
				{
					max = pl[minPosToRemove];
					avg = outerSum / windowSize;
					double mul = avg * allowedIncrease;
					
					if(max > mul)
					{
						return true;
					}
					
					if(prevAvg * allowedIncrease < avg)
					{
						return true;
					}
					outerSum = outerSum - inputs[minPosToRemove];
					minPosToRemove++;
					prevAvg = avg;
				}
			}
		}
		return false;
	}
	
	public static int[] maxPrint(int nums[], int k )
	{
		if(nums==null||nums.length==0)
	        return new int[0];
	 
		int[] result = new int[nums.length-k+1];
	 
	    LinkedList<Integer> deque = new LinkedList<Integer>();
	    for(int i=0; i<nums.length; i++){
	        if(!deque.isEmpty()&&deque.peekFirst()==i-k) 
	            deque.poll();
	 
	        while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
	            deque.removeLast();
	        }    
	 
	        deque.offer(i);
	 
	        if(i+1>=k)
	            result[i+1-k]=nums[deque.peek()];
	    }
	    return result;
	}
}