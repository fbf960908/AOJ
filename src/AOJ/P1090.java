package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1090 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int num = 0;
			for (int i = 0; i <= n / 2; i++) {
				if (isPrime(i) && isPrime(n - i))
					num++;
			}
			System.out.println(num);
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
