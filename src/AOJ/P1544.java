package AOJ;

import java.util.Scanner;

public class P1544 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		while (a-- > 0) {
			int sum = 0;
			int z = cin.nextInt();
			for (int i = 1; i <= z; i++) {
				sum += feb(1, 1, i);
			}
			System.out.println(sum);
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
