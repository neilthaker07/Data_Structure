package decorator;

public class ConcreteDecoratorA extends Decorator {

	private String addedState;
	public ConcreteDecoratorA(Component c) {
		super(c);
	}

	public String operation()
	{
		addedState = super.operation();
		return addedBehaviour(addedState);
	}
	
	private String addedBehaviour(String in)
	{
		return "AA"+addedState+"AA";
	}
	
	
}
