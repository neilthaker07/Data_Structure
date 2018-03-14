package progs;

public class ThirdMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(thirdMax(new int[]{-2147483648,-2147483648,-2147483648,-2147483648,1,1,1}));
	}
	
	public static int thirdMax(int[] nums) {
	 
		Integer f1 = null;
		Integer f2 = null;
		Integer f3 = null;
		int l = nums.length;
		if(l==0)
		{
			return 0;
		}
		for(Integer n : nums)
		{
			if(n.equals(f1) || n.equals(f2) || n.equals(f3))
			{
				continue;
			}
			
			if(f3==null || n > f3)
			{
				if(f2 == null || n > f2)
				{
					if(f1== null || n > f1)
					{
						f3 = f2;
						f2 = f1;
						f1 = n;
					}
					else
					{
						f3 = f2;
						f2 = n;
					}
				}
				else
				{
					f3 = n;
				}
			}
		}
		
		f3 = f3==null ? f1 : f3;
		return f3;
		/*
		Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;*/
	 }

}
