package arraysProgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {
	
	public static void main(String[] args) {
		
		int a[] = new int[]{-1,0,1,2,-1,-4};//{3,4,1,6,19,17,2,8,9,7,0};
		int val = 0;
		Arrays.sort(a);// 1,2,3,4,6,8,19
		
		List<List<Integer>> op = new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			int start = i+1;
			int end = a.length-1;
			
			int curr = a[i];
			
			while(start < end)
			{
				int temp = curr + a[start] + a[end];
				
				if(temp == val)
				{
					List<Integer> l = new ArrayList();
					l.add(curr);
					l.add(a[start]);
					l.add(a[end]);
					op.add(l);
					
					while (i<a.length-1 && start < end && a[i] == a[i+1]) i++;
					while (start < end && a[start] == a[start+1]) start++;
                    while (start < end && a[end] == a[end-1]) end--;
                    
                    start++;
                    end--;
				}
				else
				{
					if(temp > val)
					{
						end--;
					}
					else 
					{
						start++;
					}
				}
				
			}
		}
		
		
		System.out.println(op);
	}

}
