package AOJ;

import java.util.Scanner;

public class P1123 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		System.out.println(a * b / max(a, b));
	}

	private static int max(int a, int b) {
		return b > 0 ? max(b, a % b) : a;
	}
}
