package narsimKar;

// towers of hanoi
public class Ch2No1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch2No1 p = new Ch2No1();
		p.process(3, 'f','t','b');
	}
	
	public void process(int n, char from, char to, char buffer)
	{
		if(n==1)
		{
			System.out.println("move disk 1 from to to: "+from + " "+to);
			return;
		}
		process(n-1, from, buffer, to);
		System.out.println("move disk n from to to: " + n+" "+from + " "+to);
		process(n-1, buffer, to,from);
		
	}
}
