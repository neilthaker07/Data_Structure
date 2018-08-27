package learnThread;

public class Threading2 implements Runnable{

	public static void main(String[] args) {

		Threading2 t1 = new Threading2();
		Thread t  = new Thread(t1);
		t.start();
	}

	public void run()
	{
		System.out.println("af222222");
	}
}
