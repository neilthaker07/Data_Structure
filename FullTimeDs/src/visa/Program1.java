package visa;

import java.util.List;

public class Program1 {

	public static void main(String[] args) {

	}

	public static String winner(List<Integer> andrea, List<Integer> maria,
			String s) {
		int mariaScore = 0;
		int andreaScore = 0;
		int deck = Math.min(andrea.size(), maria.size());

		if (s.equals("Even")) {
			for (int i = 0; i < deck; i = i + 2) {
				mariaScore += maria.get(i) - andrea.get(i);
				andreaScore += andrea.get(i) - maria.get(i);
			}
		} else if (s.equals("Odd")) {
			for (int i = 1; i < deck; i = i + 2) {
				mariaScore += maria.get(i) - andrea.get(i);
				andreaScore += andrea.get(i) - maria.get(i);
			}
		}

		return mariaScore == andreaScore ? "Tie"
				: mariaScore < andreaScore ? "Andrea" : "Maria";
	}
}