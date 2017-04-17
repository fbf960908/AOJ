package AOJ;

import java.util.Scanner;

public class P1247 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int sum = 0;
			for (int i = 0; i <= n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		cin.close();
	}
}
