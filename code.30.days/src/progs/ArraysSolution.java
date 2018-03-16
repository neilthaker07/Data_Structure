package progs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intersectionWithPos(new int[]{1,2,2,3}, new int[]{2,2});
//		reverseString("avb");
		
		generate(5);
	}
	
	public static int[] intersectionWithPos(int[] nums1, int[] nums2) {
        
		int l = nums1.length < nums2.length ? nums1.length : nums2.length;
		ArrayList<Integer> op = new ArrayList();
		for(int i=0;i<l;i++)
		{
			if(nums1[i]==nums2[i])
			{
				op.add(nums1[i]);
			}
		}
		
		int[] op1 = new int[op.size()];
		for (int i = 0; i < op.size(); i++) {
		    op1[i] = op.get(i);
		}
		
        return op1;
    }
	
	public static String reverseString(String s) {
        
        char[] c = s.toCharArray();
        char[] c1 = new char[c.length];
        int k=0;
        for(int i=c.length-1;i>=0;i--)
        {
            c1[k] = c[i];
            k++;
        }
        return String.valueOf(c1);
        
    }
	
	
	public boolean judgeCircle(String moves) {
    
		
		int x = 0,y=0;
		for(int i=0;i<moves.length();i++)
		{
			char c = moves.charAt(i);
			if(c =='R')
			{
				x++;
			}
			
			if(c=='L')
			{
				x--;
			}
			if(c=='U')
			{
				y--;
			}
			if(c=='D')
			{
				y++;
			}
		}
		
		return x==0 && y==0;
    }
	
	 public String reverseWords(String s) {
		 
		 
		 String[] str = s.split(" ");
		 StringBuilder op = new StringBuilder();
		 for(String s1 : str) 
		 {
			 s1 = new StringBuilder(s1).reverse().toString();
		 }
		 for(String s1 : str) 
		 {
			 op.append(s1).append(" ");
		 }
		 
		 return op.toString().trim();
	 }
	
	
	 public static List<List<Integer>> generate(int numRows)
	 {
	 	List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	 	ArrayList<Integer> row = new ArrayList<Integer>();
	 	for(int i=0;i<numRows;i++)
	 	{
	 		row.add(0, 1);
	 		for(int j=1;j<row.size()-1;j++)
	 			row.set(j, row.get(j)+row.get(j+1));
	 		allrows.add(new ArrayList<Integer>(row));
	 	}
	 	return allrows;
	 	
	 }
	 
	 
	 public static List<List<Integer>> generate2(int numRows)
	 {
	 	List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	 	ArrayList<Integer> row = new ArrayList<Integer>();
	 	
	 	for(int i=0;i<numRows;i++)
	 	{
	 		row.add(0, 1);
	 		for(int j=1;j<row.size()-1;j++)
	 		{
	 			row.set(j, row.get(j)+row.get(j+1));
	 		}
	 		allrows.add(row);
	 	}
	 	return allrows;
	 }
	 
	 public static List<Integer> generatePascal2(int rowNum)
	 {
	 	ArrayList<Integer> row = new ArrayList<Integer>();
	 	
	 	for(int i=0;i<=rowNum;i++)
	 	{
	 		row.add(0, 1);
	 		for(int j=1;j<row.size()-1;j++)
	 		{
	 			row.set(j, row.get(j)+row.get(j+1));
	 		}
	 	}
	 	return row;
	 }
	 
	 
	 
	public static int[] intersection(int[] nums1, int[] nums2) {
		
		Set<Integer> s1 = new HashSet();
		Set<Integer> s2 = new HashSet(); 
		ArrayList<Integer> a1 = new ArrayList();
		for(int i=0;i<nums1.length;i++)
		{
			s1.add(nums1[i]);
		}
		
		for(int i=0;i<nums2.length;i++)
		{
			if(s1.contains(nums2[i]) && !s2.contains(nums2[i]))
			{
				a1.add(nums2[i]);
			}
			s2.add(nums2[i]);
		}
		
		int[] op1 = new int[a1.size()];
		for (int i = 0; i < a1.size(); i++) {
		    op1[i] = a1.get(i);
		}
		
        return op1;
    }
	

}
