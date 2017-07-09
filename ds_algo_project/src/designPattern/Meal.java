package designPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	public List<Item> items = new ArrayList<Item>();
	public void addItem(Item item)
	{
		items.add(item);
	}
	public void showItem()
	{
		for(Item item:items)
		{
			System.out.println(item.name());
			System.out.println(item.price());
			System.out.println(item.packing().pack());
		}
	}
	public float getCost()
	{
		float cost = 0.0f;
	    for (Item item : items) 
	    {
	       cost += item.price();
	    }		
	    return cost;
    }
}
