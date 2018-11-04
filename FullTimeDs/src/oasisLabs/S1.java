package oasisLabs;

public class S1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaaa";
		int n = str.length();
		String x = "";
		for (int i = 0; i < n; i++) {

			// Count occurrences of current character
			int count = 1;
			while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			// Print character and its count
			x += count;
			x += str.charAt(i);
			/*
			 * System.out.print(count); System.out.print(str.charAt(i));
			 */
		}
		System.out.println(x);

	}

}
