package coinbase;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        
        
        String binaryString = Long.toBinaryString(n);
        //binaryString = binaryString.substring(binaryString.length() - numBits);
        //System.out.println(binaryString);
        
        char ff[] = new char[binaryString.length()];
        int y=0;
        for(char p : binaryString.toCharArray())
        {
        	if(p=='1')
        	{
        		p='0';
        	}
        	else
        	{
        		p='1';
        	}
        	ff[y]=p;
        	y++;
        }
        String finalNo = String.valueOf(ff);
       // System.out.println(finalNo);
       
        //System.out.println("op");
        System.out.println(Long.parseLong(finalNo,2));
	}

}
