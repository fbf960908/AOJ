package AOJ;

import java.util.Scanner;

public class P1571 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int s = cin.nextInt();
		while (s-- > 0) {
			int a = cin.nextInt();
			int sum = 0;
			for (int i = 0; i <= a; i++) {
				sum += Sum(i);
			}
			System.out.println(sum);
		}
		cin.close();
	}

	private static int Sum(int a) {
		if (a < 1)
			return 0;
		return a == 1 ? 1 : Sum(a - 1) + a;
	}
}
