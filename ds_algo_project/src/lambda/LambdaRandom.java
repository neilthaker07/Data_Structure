package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LambdaRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaRandom lr = new LambdaRandom();
		lr.getRandomAns();
	}

	public void getRandomAns()
	{
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		List<Integer> subset = new ArrayList<Integer>();
		Random random = new Random();
		/*for(Integer a : ll)
		{
			if(random.nextBoolean())
			{
				subset.add(a);
			}
		}*/
		
		subset = ll.stream().filter(k->{return random.nextBoolean();}).collect(Collectors.toList());
		System.out.println(subset);
	}
	
}
