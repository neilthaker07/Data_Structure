package samsungResearch;

import java.util.HashMap;

public class Sol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//largestUniquePath(T);

	}
		/*private HashMap<Integer, Integer> pathMapping = new HashMap<>();
		private Integer maxUniqueLength = Integer.MIN_VALUE;


		public static int largestUniquePath(Tree T){

		   if(T == null){
		       return pathMapping.size();
		   }

		   pathMapping.put(T.x, pathMapping.getOrDefault(T.x, 0)+1);

		   int left = largestUniquePath(T.l);
		   int right = largestUniquePath(T.r);

		   int max = Math.max(left,right);

		   pathMapping.put(T.x, pathMapping.get(T.x) - 1);

		   if(pathMapping.get(T.x) == 0) {
		       pathMapping.remove(T.x);
		   }

		   return maxUniqueLength < max ? max : maxUniqueLength;
		}

*/
}
