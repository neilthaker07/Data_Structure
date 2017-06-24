package stackQueue;

import java.util.LinkedList;

public class AnimalShelter2Queues {

	// Use of 2 queues
	// Better than use of 1 queue
	// never iterate through list
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalShelter2Queues as = new AnimalShelter2Queues();
		as.process();
	}

	LinkedList<Animal2> dog = new LinkedList<Animal2>(); // dog
	LinkedList<Animal2> cat = new LinkedList<Animal2>(); // cat

	public void process()
	{
		enqueue(new Cat2("c1"));
		enqueue(new Dog2("d1"));
		enqueue(new Dog2("d2"));
		enqueue(new Dog2("d3"));
		enqueue(new Dog2("d4"));
		enqueue(new Cat2("c2"));
		enqueue(new Dog2("d5"));
		dequeueAny();
		dequeueDog();
		dequeueCat();
		
		for(int i=0;i<dog.size();i++)
		{
			System.out.println(dog.get(i));
		}
		for(int i=0;i<cat.size();i++)
		{
			System.out.println(cat.get(i));
		}
	}
	int time = 0;
	public void enqueue(Animal2 a) 
	{
		if(a instanceof Dog2)
		{
			a.setTime(time);
			dog.add(a);
		}
		else if(a instanceof Cat2)
		{
			a.setTime(time);
			cat.add(a);
		}
		time++;
	}
	
	public void dequeueAny()
	{
		Animal2 ad = dog.get(0);
		ad.getTime();
		Animal2 ac = cat.get(0);
		ac.getTime();
		
		if(ad.getTime() > ac.getTime())
		{
			cat.poll();
		}
		else
		{
			dog.poll();
		}
	}
	
	public void dequeueDog()
	{
		dog.remove(0);
	}
	public void dequeueCat()
	{
		cat.remove(0);
	}
}

class Animal2
{
	String name;
	int time ;
	Animal2(String name)
	{
		this.name=name;
	}

	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}

class Dog2 extends Animal2
{
	Dog2(String name)
	{
		super(name);
	}
}

class Cat2 extends Animal2
{
	Cat2(String name)
	{
		super(name);
	}
}