package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1490关于最大公约数的疑惑 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int num = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (isPrime(gcd(i, j)))
					num++;
			}
		}
		System.out.println(num);
		cin.close();
		cout.close();
	}

	private static int gcd(int a, int b) {
		return b > 0 ? gcd(b, a % b) : a;
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
