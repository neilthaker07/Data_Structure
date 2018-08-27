package learnThread;

public class SyncTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		T t = new T();
		T1 t1 = new T1(t);
		T2 t2 = new T2(t);
		t1.start();
		t2.start();
		
	}

}

class T
{
	synchronized public void process(int n)
	{
		for(int i=0;i<8;i++)
		{
			System.out.println(i*n);
			 try{  
			       Thread.sleep(400);  
			      }catch(Exception e){System.out.println(e);}  
		}
	}
}

class T1 extends Thread
{
	T t;
	T1(T t)
	{
		this.t=t;
	}
	public void run()
	{
		t.process(2);
	}
	
}
class T2 extends Thread
{
	T t;
	T2(T t)
	{
		this.t=t;
	}
	public void run()
	{
		t.process(100);
	}
	
}