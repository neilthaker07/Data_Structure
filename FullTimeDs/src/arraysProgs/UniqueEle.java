package arraysProgs;

public class UniqueEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{1,5,4,2,1,3,3,2,4,5,99,88,88,77,99};
		int k = 0;
		for(int i:a)
		{
			k = k^i;
		}
		System.out.println(k);
	}

}
