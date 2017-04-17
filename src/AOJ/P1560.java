package AOJ;

import java.util.Scanner;

public class P1560 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			while (a > 10) {
				String str = String.valueOf(a);
				int sum = 0;
				for (int i = 0; i < str.length(); i++) {
					sum += Integer.parseInt(str.substring(i, i + 1));
				}
				a = sum;
			}
			System.out.println(a);
		}
	}
}
