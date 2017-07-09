package designPattern;

public abstract class ColdDrink implements Item{

	public Bottle packing()
	{
		return new Bottle();
	}
	public abstract float price();
}
