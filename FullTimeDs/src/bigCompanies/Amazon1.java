package bigCompanies;

import java.util.*;

// 23280666141894
public class Amazon1 {

	public static void main(String[] args) {
		
		List<List<Integer>> allLocations = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();
		/*List<Integer> l4 = new ArrayList<Integer>();
		List<Integer> l5 = new ArrayList<Integer>();
		List<Integer> l6 = new ArrayList<Integer>();*/
		l1.add(1);
		l1.add(-3);
		l2.add(1);
		l2.add(2);
		l3.add(3);
		l3.add(4);/*
		l4.add(3);
		l4.add(4);
		l5.add(3);
		l5.add(4);
		l6.add(3);
		l6.add(4);*/
		allLocations.add(l1);
		allLocations.add(l2);
		allLocations.add(l3);
		
		List<List<Integer>> op = nearestVegetarianRestaurant(6, allLocations, 3);
		System.out.println(op);
	}

	static List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants,
			List<List<Integer>> allLocations, int numRestaurants) 
	{
		if(numRestaurants == totalRestaurants)
			return allLocations;
		
		Map<Double, List<List<Integer>>> map = new HashMap();
		for(List<Integer> eachLoc : allLocations)
		{
			double dist = Math.sqrt((eachLoc.get(0)*eachLoc.get(0)) + (eachLoc.get(1)*eachLoc.get(1)));
			
			if(!map.containsKey(dist))
			{
				List<List<Integer>> l = new ArrayList();
				l.add(eachLoc);
				map.put(dist, l);
			}
			else
			{
				List<List<Integer>> l = map.get(dist);
				l.add(eachLoc);
				map.put(dist, l);
			}
		}
		
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		for(Double d : map.keySet())
		{
			pq.offer(d);
		}
		
		int temp=0;
		List<List<Integer>> output = new ArrayList();
		while(temp<numRestaurants)
		{
			double d = pq.remove();
			List<List<Integer>> q = map.get(d);
			for(List<Integer> w : q)
			{
				if(temp<numRestaurants)
				{
					output.add(w);
					temp++;
				}
			}
		}
		
		return output;
	}
}
