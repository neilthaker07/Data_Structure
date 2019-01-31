package arraysProgs;

import java.util.HashMap;
import java.util.Stack;

class BinaryTreeNode{
	
}

public class Test55 {
	
	
	public void verticalSum(BinaryTreeNode root){

        if(root == null) return;

        HashMap<Integer, Integer> vSumMap = new HashMap<>();

        verticalSumHelper(root, 0, vSumMap);

        for(int key: vSumMap.keySet()){
            System.out.println("\nVertical Sum : "+ vSumMap.get(key));
        }

    }

    private void verticalSumHelper(BinaryTreeNode node, int horizontalDistance, HashMap<Integer,Integer> vSumMap)
    {
        if(node  == null) return;

        verticalSumHelper( node.getLeft(), horizontalDistance - 1, vSumMap);

        int prevSum = vSumMap.get(horizontalDistance)==null ? 0 : vSumMap.get(horizontalDistance);
        int sum = prevSum + node.getData();
        vSumMap.put(horizontalDistance, sum);

        verticalSumHelper(node.getRight(), horizontalDistance + 1, vSumMap);
    }

	public static void main(String[] args) {

		//System.out.println(calculate("2*3*5"));
		//System.out.println(convertToTitle(26));
		//System.out.println(binary(new int[]{8,9,10,11,12}));
		//System.out.println(addStrings("123", "456"));
		System.out.println(isRectangleOverlap(new int[]{7,8,13,15}, new int[]{10,8,12,20}));
	}
	
	 public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
	        
		 
		 return Math.min(rec1[3],rec2[3]) > Math.max(rec1[1],rec2[1]) &&
				 Math.min(rec1[2],rec2[2]) > Math.max(rec1[0],rec2[0]);
		 
	    }
	
	static int binary(int a[])
	{
		if(a==null || a.length==0)
			return -1;
		
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			int diff = mid-start;
			int leftDiff = a[mid]-a[start];
			int rightDiff = a[end]-a[mid];
			
			if(diff==1)
			{
				if(diff==leftDiff && diff!=rightDiff)
				{
					return a[mid+1];
				}
				else if(diff==rightDiff && diff!=leftDiff)
				{
					return a[mid];
				}
				else
				{
					return -1;
				}
			}
			
			if(diff==leftDiff)
			{
				start=mid;
			}
			else
			{
				end=mid;
			}
		}
		
		return -1;
	}
	
	
	
	public static String addStrings(String num1, String num2) {
        if(num1==null && num2==null)
        {
            return null;
        }
        if(num1==null)
        {
            return num2;
        }
        if(num2==null)
        {
            return num1;
        }
        
        char c1[] = num1.toCharArray();
        char c2[] = num2.toCharArray();
        
        int l1=num1.length();
        int l2=num2.length();
        int c=0;
        
        StringBuilder op=new StringBuilder();
        int i=l1-1;
        int j=l2-1;
        while(i>=0 ||  j>=0)
        {
            int sum=0;
            if(i>=0)
            {
                sum+=c1[i]-'0';
            }
            if(j>=0)
            {
                sum+=c2[j]-'0';
            }
            sum+=c;
            c=sum/10;
            op.append(String.valueOf(sum%10));
            i--;
            j--;
        }
        if(c!=0)
            op.append(c);
        return op.reverse().toString();
    }
	
	static String convertToTitle(int n)
	{
		return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
	}

	public static int calculate(String s) {
		int len;
		if (s == null || (len = s.length()) == 0)
			return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int num = 0;
		char sign = '+';
		
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(s.charAt(i))) {
				num = num * 10 + s.charAt(i) - '0';
			}
			if ((!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i))
					|| i == len - 1) {
				if (sign == '-') {
					stack.push(-num);
				}
				if (sign == '+') {
					stack.push(num);
				}
				if (sign == '*') {
					stack.push(stack.pop() * num);
				}
				if (sign == '/') {
					stack.push(stack.pop() / num);
				}
				sign = s.charAt(i);
				num = 0;
			}
		}

		int re = 0;
		for (int i : stack) {
			re += i;
		}
		return re;
	}

}
