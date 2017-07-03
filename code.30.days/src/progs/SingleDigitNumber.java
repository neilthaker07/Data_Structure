package progs;

public class SingleDigitNumber {

	public static void main(String[] args) {
		SingleDigitNumber s = new SingleDigitNumber();
		System.out.println(s.addDigits(543));
		
		int num = 897;
		System.out.println(num == 0 ? 0 : ( num%9 == 0 ? 9 : (num%9) ));
	}

	public int addDigits(int n)
	{
		getDigits(n);
		if(s<10)
		{
			return s;
		}
		int t = s;
		s=0;
		return addDigits(t);
	}
	
	int s = 0;
	public int getDigits(int n)
	{
		s+=n%10;
		n=n/10;
		if(n<10)
		{
			s+=n;
			return n;
		}
		return getDigits(n);
	}
}