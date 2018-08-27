package learnThread;

public class Threading1 extends Thread{

	public static void main(String[] args) {

		Threading1 t1 = new Threading1();
		t1.start();
	}

	public void run()
	{
		System.out.println("af");
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("af");
		
	}
}
