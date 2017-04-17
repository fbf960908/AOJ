package AOJ;

import java.util.Scanner;

public class P1144 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		for (int i = a; i < b; i++) {
			if (isPrime(i) && isHui(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isHui(int i) {
		String num = String.valueOf(i);
		return new StringBuffer(num).reverse().toString().equalsIgnoreCase(num);
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