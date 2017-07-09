package designPattern;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = Test.getInstance();
		t.showMessage();
	}
}
class Test
{
	//create an object of SingleObject
	   private static Test instance = new Test();
	
	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Test(){}
	
	   //Get the only object available
	   public static Test getInstance()
	   {
	      return instance;
	   }
	
	   public void showMessage()
	   {
	      System.out.println("Hello World!");
	   }
}