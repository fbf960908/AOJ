package AOJ;

import java.util.Scanner;

public class P1028 {
	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		System.out.println(abc(a));
	}

	private static int abc(int a) {
		return a == 1 ? 10 : abc(a - 1) + 2;
	}
}
