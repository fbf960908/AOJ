package AOJ;

import java.util.Scanner;

public class P1206 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		while (a-- > 0) {
			int s = cin.nextInt();
			int sum = 0;
			while (s-- > 0) {
				int d = cin.nextInt();
				if (isPrime(d))
					sum += d;
			}
			System.out.println(sum);
		}

	}

	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int c = 3; c * c <= n; c += 2) {
			if (n % c == 0)
				return false;
		}
		return true;
	}

}
