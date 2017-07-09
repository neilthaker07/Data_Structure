package designPattern;

public class BuilderPattern {

	public static void main(String sp[])
	{
		MealBuilder m = new MealBuilder();
		Meal veg = m.prepareVeg();
		System.out.println("VEG");
		veg.showItem();
		System.out.println(veg.getCost());
		
		Meal nonveg = m.prepareNonVegMeal();
		System.out.println("NON VEG");
		nonveg.showItem();
		
		nonveg.showItem();
		System.out.println(nonveg.getCost());
	}
	
}
