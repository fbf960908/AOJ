package AOJ;

import java.util.Scanner;

public class P1181 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		while (cin.hasNext()) {
			int n = cin.nextInt();
			System.out.println(feb(1, 1, n));
		}
	}

	public static long feb(long a, long b, int n) {
		if (n < 0)
			return 0;
		if (n == 1)
			return a;
		if (n == 2)
			return b;
		return feb(b, a + b, n - 1);
	}

}
