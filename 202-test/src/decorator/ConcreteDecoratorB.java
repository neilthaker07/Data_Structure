package decorator;

public class ConcreteDecoratorB extends Decorator {

	private String addedState;
	public ConcreteDecoratorB(Component c) {
		super(c);
	}

	public String operation()
	{
		addedState = super.operation();
		return addedBehaviour(addedState);
	}
	
	private String addedBehaviour(String in)
	{
		return "BB"+addedState+"BB";
	}
	
	
}
