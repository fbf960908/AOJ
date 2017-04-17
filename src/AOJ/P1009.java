package AOJ;

import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int sum = 0;
			int n = cin.nextInt();
			String s = String.valueOf(n);
			for (int i = 0; i < s.length(); i++) {
				sum += Integer.parseInt(s.substring(i, i + 1));
			}
			System.out.println(sum);
		}
		cin.close();
	}
}