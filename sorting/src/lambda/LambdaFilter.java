package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaFilter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaFilter l = new LambdaFilter();	
		
		Continent cn = new Continent();
		Continent cn1 = new Continent();
		Continent cn2 = new Continent();
		Continent cn3 = new Continent();
		Continent cn4 = new Continent();
		Continent cn5 = new Continent();
		Continent cn6 = new Continent();
		cn.setContinent("northamerica");
		cn1.setContinent("southamerica");
		cn2.setContinent("asia");
		cn3.setContinent("europe");
		cn4.setContinent("africa");
		cn5.setContinent("aus");
		cn6.setContinent("ant");
		
		Country cv = new Country();
		Country cv1 = new Country();
		Country cv2 = new Country();
		Country cv3 = new Country();
		Country cv4 = new Country();
		
		cv4.setCont("europe");
		cv4.setCountryName("england");
		cv4.setPopulation(5);
		
		cv.setCountryName("usa");
		cv.setPopulation(100);
		cv.setCont(cn.getContinent());
		
		cv1.setCountryName("canada");
		cv1.setCont(cn.getContinent());
		cv1.setPopulation(50);
		
		cv2.setCountryName("mexico");
		cv2.setCont(cn.getContinent());
		cv2.setPopulation(25);
		
		cv3.setCountryName("india");
		cv3.setCont(cn2.getContinent());
		cv3.setPopulation(9000);
	
		List<Country> cc = new ArrayList<Country>();
		cc.add(cv);
		cc.add(cv4);
		cc.add(cv3);
		cc.add(cv1);
		System.out.println(l.getPopulation(cc, "northamerica"));
	}

	public int getPopulation(List<Country> cc, String cont)
	{
		/*int totalPopulation = 0;
		for(Country c:cc)
		{
			totalPopulation += c.getCont().equals(cont) ? c.getPopulation() : 0;
		}*/
		Stream<Integer> pops = cc.stream().map(c -> c.getCont().equals(cont) ? c.getPopulation() : 0); // lambda filter 
		//return totalPopulation;
		return pops.reduce(0, (a,b) -> a+b);
	}
}
