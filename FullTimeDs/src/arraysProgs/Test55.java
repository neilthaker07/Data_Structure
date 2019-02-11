package arraysProgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class BinaryTreeNode{
	
	BinaryTreeNode left;
	BinaryTreeNode right;
	int val;
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

        verticalSumHelper( node.left, horizontalDistance - 1, vSumMap);

        int prevSum = vSumMap.get(horizontalDistance)==null ? 0 : vSumMap.get(horizontalDistance);
        int sum = prevSum + node.val;
        vSumMap.put(horizontalDistance, sum);

        verticalSumHelper(node.right, horizontalDistance + 1, vSumMap);
    }

	public static void main(String[] args) {

		//System.out.println(calculate("2*3*5"));
		//System.out.println(convertToTitle(26));
		//System.out.println(binary(new int[]{8,9,10,11,12}));
		//System.out.println(addStrings("123", "456"));
		//System.out.println(isRectangleOverlap(new int[]{7,8,13,15}, new int[]{10,8,12,20}));
		
		//System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
		//System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
		//System.out.println(isBipartite(new int[][]{{0,2},{1,3},{1,3},{0,2}}));
		//System.out.println(kSmallestPairs(new int[]{1,7,11}, new int[]{2,5,9}, 3));
		//System.out.println(strStr("hello","ll"));
		//System.out.println(maxTurbulenceSize(new int[]{9,4,2,10,7,8,8,1,9}));
		//System.out.println(findReplaceString("abcd", new int[]{0,2}, new String[]{"ab","ec"}, new String[]{"eee","ffff"}));
		System.out.println(numberOfBoomerangs(new int[][]{{0,0},{1,0},{2,0}}));
	}

	public static int numberOfBoomerangs(int[][] points) {

		int res = 0;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if (i == j)
					continue;

				int d = getDistance(points[i], points[j]);
				map.put(d, map.getOrDefault(d, 0) + 1);
			}

			for (int val : map.values()) {
				res += val * (val - 1);
			}
			map.clear();
		}

		return res;

	}

	private static int getDistance(int[] a, int[] b) {
		int dx = a[0] - b[0];
		int dy = a[1] - b[1];

		return dx * dx + dy * dy;
	}
	
	 public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) 
	 {
	        StringBuilder sb = new StringBuilder(S);
	        int len = S.length();
	        int[] indexValInvert = new int[len];
	        Arrays.fill(indexValInvert, -1);
	        for (int i = 0; i < indexes.length; ++i) { indexValInvert[indexes[i]] = i; }
	        for (int i = len - 1; i >= 0; --i) {
	            int j = indexValInvert[i];
	            if (j < 0) { continue; }
	            if (S.substring(indexes[j]).startsWith(sources[j])) {
	                sb.replace(indexes[j], indexes[j] + sources[j].length(), targets[j]);
	            }
	        } 
	        return sb.toString();
	    }
	
	public static int maxTurbulenceSize(int[] A) {
        int N = A.length;
        int ans = 1;
        int anchor = 0;

        for (int i = 1; i < N; ++i) {
            int c = Integer.compare(A[i-1], A[i]);
            if (c == 0) {
                anchor = i;
            } else if (i == N-1 || c * Integer.compare(A[i], A[i+1]) != -1) {
                ans = Math.max(ans, i - anchor + 1);
                anchor = i;
            }
        }

        return ans;
    }
	
	 public static int strStr(String haystack, String needle) {
	        //return haystack.indexOf(needle);
	        
	        if(needle==null || needle.equals("") || haystack==null || haystack.equals(""))
	            return -1;
	        
	        if(needle.length() > haystack.length())
	            return -1;
	        
	        char c1[] = haystack.toCharArray();
	        int l2 = needle.length();
	        
	        String temp = "";
	        int j=0;
	        for(int i=0;i<c1.length;i++)
	        {
	            if(i<l2-1)
	            {
	                temp+=c1[i];
	            }
	            else
	            {
	                temp+=c1[i];
	                
	                if(temp.equals(needle))
	                {
	                    return j;
	                }
	                j++;
	                temp = temp.substring(1,l2);                
	            }
	        }
	        return -1;
	    }
	
	public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		PriorityQueue<int[]> que = new PriorityQueue<>((a, b) -> a[0] + a[1]
				- b[0] - b[1]);
		List<int[]> res = new ArrayList<>();
		
		if (nums1.length == 0 || nums2.length == 0 || k == 0)
			return res;
		
		for (int i = 0; i < nums1.length && i < k; i++)
			que.offer(new int[] { nums1[i], nums2[0], 0 });
		
		while (k-- > 0 && !que.isEmpty()) 
		{
			int[] cur = que.poll();
			res.add(new int[] { cur[0], cur[1] });
			if (cur[2] == nums2.length - 1)
				continue;
			que.offer(new int[] { cur[0], nums2[cur[2] + 1], cur[2] + 1 });
		}
		return res;
	}
	
	public static boolean isBipartite(int[][] graph) {
        
	    int len = graph.length;
	        int[] colors = new int[len];
	        
	        for (int i = 0; i < len; i++) {
	            if (colors[i] != 0) continue;
	            Queue<Integer> queue = new LinkedList<>();
	            queue.offer(i);
	            colors[i] = 1;   // Blue: 1; Red: -1.
	            
	            while (!queue.isEmpty()) {
	                int cur = queue.poll();
	                for (int next : graph[cur]) {
	                    if (colors[next] == 0) {          // If this node hasn't been colored;
	                        colors[next] = -colors[cur];  // Color it with a different color;
	                        queue.offer(next);
	                    } else if (colors[next] != -colors[cur]) {   // If it is colored and its color is different, return false;
	                        return false;
	                    }
	                }
	            }
	        }
	        
	        return true;
	    }
	
	public static int lengthOfLIS(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        
        int c=1;
        int ans=1;
        for(int i=0;i<nums.length;i++)
        {
            if(i+1<nums.length && nums[i+1]>nums[i])
            {
                c++;
            }
            else
            {
                c=1;
            }
            ans = Math.max(c,ans);
        }
        return ans;
    }
	
	
	// Return index of gas station 
	static int canCompleteCircuit(int gas[], int cost[]) {
		int start = 0;
		int end = gas.length - 1;
		int sum = gas[end] - cost[end];

		while (start < end) 
		{
			if (sum >= 0) 
			{
				sum += gas[start] - cost[start];
				++start;
			} 
			else 
			{
				--end;
				sum += gas[end] - cost[end];
			}
		}
		return sum >= 0 ? end : -1;
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
