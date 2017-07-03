package progs;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDigits r = new ReverseDigits();
		int num = -125;
		//r.reverse(num);
		//System.out.println(num<0 ? r.op*-1 : r.op);
		System.out.println(r.reverse(num));
	}
	
	int op = 0;
	int c=100;
	public int reverse(int n)
	{
		/*if(n<0)
		{
			n*=-1;
		}
		if(n<-2147483648 || n>2147483647)
		{
			return 0;
		}
		op += (n%10) * c;
		c/=10;
		return- n<10 ? n : reverse(n/10);*/
		
		int result=0;
		while(n!=0)
		{
			int tmp1 = n%10;
			int tmp2 = result*10 + tmp1;
			result = tmp2;
			n=n/10;
		}
		return result;
	}
}
