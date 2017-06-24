package stackQueue;

import java.util.LinkedList;

public class AnimalShelter {

	// Use of one queue 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalShelter as = new AnimalShelter();
		as.process();
	}
	
	LinkedList<Animal> l = new LinkedList<Animal>();
	public void process()
	{
		enqueue();
		dequeueAny();
		dequeueDog();
		dequeueCat();
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

	public void enqueue() 
	{
		l.add(new Dog("d1"));
		l.add(new Dog("d2"));
		l.add(new Cat("c1"));
		l.add(new Dog("d3"));
		l.add(new Cat("c2"));
		l.add(new Dog("d4"));
		l.add(new Dog("d5"));
		l.add(new Cat("c2"));
	}
	
	public void dequeueAny()
	{
		l.remove(l.getFirst().name);
	}
	
	public void dequeueDog()
	{
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i) instanceof Dog)
			{
				l.remove(i);
				break;
			}
		}
	}
	public void dequeueCat()
	{
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i) instanceof Cat)
			{
				l.remove(i);
				break;
			}
		}
	}
}

class Animal
{
	String name;
	Animal(String name)
	{
		this.name=name;
	}
}

class Dog extends Animal
{
	Dog(String name)
	{
		super(name);
	}
}

class Cat extends Animal
{
	Cat(String name)
	{
		super(name);
	}
}