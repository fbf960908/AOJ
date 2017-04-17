package AOJ;

import java.util.Scanner;

public class P1022 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.print(feb(1, 1, i) + " ");
		}

	}

	public static long feb(long a, long b, int n) {
		if (n < 1)
			return 0;
		if (n == 1)
			return a;
		if (n == 2)
			return b;
		return feb(b, a + b, n - 1);
	}
}
