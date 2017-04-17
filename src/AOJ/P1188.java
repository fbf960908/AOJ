package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1188 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			for (int i = a / 2; i <= a; i++) {
				int att = a - i;
				if (isPrime(i) && isPrime(att)) {
					System.out.println(att + " " + i);
					break;
				}
			}
		}
		cin.close();
		cout.close();
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
