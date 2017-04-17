package AOJ;

import java.util.Scanner;

public class P1202 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int sum = 0;
			if (n < 0) {
				n = -1 * n;
			}
			String str = "" + n;
			for (int i = 0; i < str.length(); i++) {
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
			if (n % sum == 0)
				System.out.println("Lucky Word");
			else
				System.out.println("No Answer");
		}
	}
}
