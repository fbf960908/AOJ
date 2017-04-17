package AOJ;

import java.util.Scanner;

public class P1291 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		for (int i = a; i <= b; i++) {
			if (shuixian(i))
				System.out.println(i);
		}
	}

	private static boolean shuixian(int num) {
		if (num < 100 || num >= 1000)
			return false;
		int a, b, c;
		a = num / 100;
		b = num % 100 / 10;
		c = num % 10;
		if (a * a * a + b * b * b + c * c * c == num)
			return true;
		else
			return false;
	}
}
