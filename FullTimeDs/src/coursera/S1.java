package coursera;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	


    /*
     * Complete the 'canReach' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER y1
     *  3. INTEGER x2
     *  4. INTEGER y2
     */

    public static String canReach(int x1, int y1, int x2, int y2) {
    // Write your code here
        
         // base case x1,y1,x2,y2
        if (x1 > x2 || y1 > y2) 
            return "No"; 
      
        // current point is equal to destination 
        if (x1 == x2 && y1 == y2) 
            return "Yes"; 
      
        // check for other 2 possibilities 
        //return (canReach(x1 + y1, y1, x2, y2) ||  
        //        canReach(x1, y1 + x1, x2, y2)); 
        String a = canReach(x1 + y1, y1, x2, y2);
        String b = canReach(x1, y1 + x1, x2, y2);
        return (a.equals("Yes") || b.equals("Yes")) ? "Yes" : "No";
    }

}
