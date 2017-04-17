package AOJ;

import java.util.Scanner;

public class P1272 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int sum = cin.nextInt();
		if (sum % 100 == 0)
			sum /= 100;
		if (sum % 10 == 0)
			sum /= 10;
		String s = String.valueOf(sum);
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.substring(i, i + 1));
		}
		cin.close();
	}
}
