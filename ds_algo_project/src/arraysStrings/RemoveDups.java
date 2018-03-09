package arraysStrings;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(removeDuplicates(new int[]{1,1,2}));
	}

	public static int removeDuplicates(int[] nums) {

		int pos = 0;
		for (int i = 0; i < nums.length; i++) {

			int t = i;
			int i2 = i;
			while (nums[t] == nums[i2 + 1]) {
				int temp = nums[nums.length - 1];
				nums[nums.length - 1] = nums[i2 + 1];
				i2++;
			}
			pos = t;
			/*t = 0;
			i2 = 0;
*/
		}

		return pos;

	}

}
