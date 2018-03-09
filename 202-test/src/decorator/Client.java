package decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component c = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
		System.out.println(c.operation());
		
	}

}
