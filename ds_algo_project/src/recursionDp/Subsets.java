package recursionDp;

import java.util.ArrayList;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets s = new Subsets();
		s.sub();
	}
	public void sub()
	{
		ArrayList<Integer> hs = new ArrayList<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println(process(hs, 0));
	}
	
	public ArrayList<ArrayList<Integer>> process(ArrayList<Integer> set,int index)
	{
		ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
		if(set.size() == index)
		{
			all.add(new ArrayList<Integer>());
		}
		else
		{
			all = process(set, index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> more = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset : all)
			{
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				more.add(newsubset);
			}
			all.addAll(more);
		}
		return all;
	}
}