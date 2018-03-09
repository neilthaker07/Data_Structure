package decorator;

public class Decorator implements Component{

	Component component;
	
	public Decorator(Component c)
	{
		component = c;
	}
	
	@Override
	public String operation() {
		return component.operation();
	}
	
}
