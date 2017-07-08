package bits;

public class LonelyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[]{4,6,4,6,5,3,5};
		int r = 0; 
		for(int n : array)
		{
			r^=n; // XOR all elements and only single no. will be result : 1 XOR 0 : 1 , 1 XOR 1 is 0
		}
		System.out.println(r);
	}
}