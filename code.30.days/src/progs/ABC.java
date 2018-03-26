package progs;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s = "abc def ";
		String[] parts = s.trim().split("\\s+");
		String out = "";
		for (int i = parts.length - 1; i > 0; i--) {
		    out += parts[i] + " ";
		}
		System.out.println(out + parts[0]);
		
		try{
			
		}
		finally{
			
		}*/
		
		System.out.println(findComplement(4));

	}
	
	public static int findComplement(int num) {
     
		
		return ~num & ((Integer.highestOneBit(num) << 1) - 1);
		
    }

}
