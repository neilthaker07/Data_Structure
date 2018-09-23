package visa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<String> fetchItemsToDisplay(List<List<String>> items, 
			int sortParameter, 
			int sortOrder, 
			int itemPerPage, 
			int pageNumber) {

		 List<String> list = new ArrayList<String>();

	        Collections.sort(items, new Comparator<List<String>>() 
	        {
	           
	            @Override
	            public int compare(List<String> a, List<String> b) 
	            {
	                if(sortParameter ==0)
	                {
	                    if (sortOrder == 0)
	                    {
	                        return a.get(sortParameter).compareTo(b.get(sortParameter));
	                    } 
	                    else
	                    {
	                        return b.get(sortParameter).compareTo(a.get(sortParameter));
	                    }
	                }
	                else
	                {
	                    if (sortOrder == 0)
	                    {
	                        return Integer.parseInt(a.get(sortParameter)) - Integer.parseInt(b.get(sortParameter));
	                    } 
	                    else
	                    {
	                        return Integer.parseInt(b.get(sortParameter)) - Integer.parseInt(a.get(sortParameter));
	                    }
	                    
	                }
	            }
	            
	        });
	        
	        for (int i = ((itemPerPage * (pageNumber + 1)) - itemPerPage); i < Math.min(items.size(), (itemPerPage * (pageNumber + 1))); i++) 
	        {
	            System.out.println(items.get(i).get(0));
	            list.add(items.get(i).get(0));
	        }

	        return list;


	}

}
