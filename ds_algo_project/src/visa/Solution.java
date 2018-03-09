package visa;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(canReach(1, 5,17,12));

	}
	
	static String canReach(int x1, int y1, int x2, int y2) {

		if(canReachPath(x1, y1, x2, y2))
		{
			return "Yes";
		}
		return "No";
/*		if(x2<x1 || y2<y1)
		{
			return "No";
		}
		int f1 = func1(x1, y1, x2, y2);
		int f2 = func2(x1, y1, x2, y2);
		if(f1+f2>0)
		{
			return "Yes";
		}
		else
		{
			return "No";
		}*/
    }
	
	/*static int func1(int x1, int y1, int x2, int y2)
	{
		if(x2<x1 || y2<y1)
        {
            return 0;
        }
		else if(x1==x2 && y1==y2)
		{
			return 1;
		}
		else if(x2>x1)
		{
			return func1(x1+y1, y1, x2, y2);
		}
		else if(y2>y1)
		{
			return func1(x1, x1+y1, x2, y2);
		}
		return 0;
    }
	
	static int func2(int x1, int y1, int x2, int y2)
	{
		if(x2<x1 || y2<y1)
        {
            return 0;
        }
		else if(x1==x2 && y1==y2)
		{
			return 1;
		}
		else if(y2>y1)
		{
			return func2(x1+y1, y1, x2, y2);
		}
		else if(x2>x1)
		{
			return func2(x1, x1+y1, x2, y2);
		}
		return 0;
    }

*/
	
	public static Boolean canReachPath(int x1, int y1, int x2, int y2){
	    if(x1 == x2 && y1 == y2) return true;
	    if(x1 > x2 || y1 > y2) return false;
	    return canReachPath(x1 + y1, y1, x2, y2) || canReachPath(x1, y1 + x1, x2, y2);
	    
	    
	 /*   while (sx<tx && sy<ty) if (tx<ty) ty%=tx; else tx%=ty;
        return sx==tx && (ty-sy)%sx==0 || sy==ty && (tx-sx)%sy==0;
	    
	    */
	    
	    
	}

	/*public static boolean startingMethod(int x1, int y1, int x2, int y2){
	    return canReachPath(x1, y1, x2, y2);
	}*/
}
