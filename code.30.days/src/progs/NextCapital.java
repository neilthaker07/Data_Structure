package progs;

public class NextCapital {

	public static void main(String[] args) {
		
		//String y[] = strengthenPasswords(new String[]{"hooRayNexTcapItaLnextcapitall"});
		
		//String y[] = strengthenPasswords(new String[]{"glass","Sculpture","wishing"});
		//String y[] = strengthenPasswords(new String[]{"o2d","fi4ht","ben2hen","next1door"});
		String y[] = strengthenPasswords(new String[]{"Qwerty","traY","DfghjK","zxcv3456nmxc",null});
		//String y[] = strengthenPasswords(new String[]{"nextcapital","NeXtcapital","nExtCapitAli5cool","hooRayNexTcapItaLnextcapitall"});
		
		System.out.println(y[0]+" "+y[1]+" "+y[2]+" "+y[3]+" "+y[4]);
		
	}

	static String[] strengthenPasswords(String[] passwords) {
	//String[] stringArray = new String[]{"hooRayNexTcapItaLnextcapitall"};
	                //hooRayTxeNcapItaLnextcapitall

	String finalArray[] = new String[passwords.length];
	int counter=0;
    for(String pass : passwords)
    {
    	if(pass!=null)
    	{
	        char p[] = pass.toCharArray();
	        char op[] = new char[p.length];
	        for(int i=0;i<p.length;i++)
	        {
	            p[i] = (p[i]=='s' || p[i]=='S') ? '5' : p[i];
	            op[i]=p[i];
	        }
	        //System.out.println("pass1 ");
	        //System.out.println(String.valueOf(op));
	
	        char op22[] = new char[p.length+1] ;
	        if(op.length % 2 !=0 && Character.isDigit(op[op.length/2]) )
	        {
	            char y = op[op.length/2];
	            int y1 = (Character.getNumericValue(y)) * 2;
	            if(y1 >= 10)
	            {
	                char nums[] = new char[2];
	                nums[0] = (char) ((y1/10) + '0');
	                nums[1] = (char) ((y1%10) + '0');
	                op22 = new char[p.length+1];
	
	                for(int j =0 ; j<p.length/2;j++)
	                {
	                        op22[j] = op[j];
	                }
	
	                op22[p.length/2] = nums[0];
	                op22[(p.length/2)+1] = nums[1];
	                for(int j=(p.length/2)+2;j<p.length+1;j++)
	                {
	                        op22[j] = op[j-1];
	                }
	
	                //System.out.println("pass2 ");
	                //System.out.println(String.valueOf(op22));
	            }
	            else
	            {
	                op[op.length/2] =  (char)(y1 + '0');
	
	                //System.out.println("pass2 ");
	                //System.out.println(String.valueOf(op));
	            }
	        }
	
	        String nextCapital = "nextcapital";
	
	        finalArray[counter] = rule3And4(op22[0] == '\u0000' ? op : op22, nextCapital);
	        counter++;
    	}
    }

    return finalArray;
}
	
	private static String rule3And4(char[] op, String nextCapital) 
	{
		String result;
		if (op.length % 2 == 0) {
			op = flipPart3(op);
		}
		//System.out.println("pass3 ");
		//System.out.println(String.valueOf(op));

		result = String.valueOf(op);

		// rule 4
		if (result.toLowerCase().contains(nextCapital)) {
			result = rule4(result, nextCapital);
		}
		return result;
	}

	private static String rule4(String result, String nextCapital) 
	{
		int index = result.toLowerCase().indexOf(nextCapital);

		String sub1 = null;
		if (index > 0) {
			sub1 = result.substring(0, index);
		}

		String sub2 = result.substring(index, index + 4);
		char temp[] = sub2.toCharArray();
		char temp2[] = new char[temp.length];
		temp2[3] = temp[0];
		temp2[2] = temp[1];
		temp2[1] = temp[2];
		temp2[0] = temp[3];
		String temp22 = String.valueOf(temp2);

		String sub3 = result.substring(index + 4, result.length());

		if (sub1 != null) {
			result = sub1.concat(temp22).concat(sub3);
		} else {
			result = temp22.concat(sub3);
		}
		//System.out.println("pass4=======");
		//System.out.println(result);
		
		return result;
	}

	public static char[] flipPart3(char a[]) {
		char temp = a[0];
		a[0] = Character.isUpperCase(a[a.length - 1]) ? Character
				.toLowerCase(a[a.length - 1]) : Character
				.toUpperCase(a[a.length - 1]);
		a[a.length - 1] = Character.isUpperCase(temp) ? Character
				.toLowerCase(temp) : Character.toUpperCase(temp);
		return a;
	}
	

}
