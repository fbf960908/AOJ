package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1216 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[] money = { 1, 2, 5, 10, 20, 50, 100 };

	public static void main(String[] args) {
		while (cin.hasNext()) {
			solve(cin.nextInt());
		}

		cout.close();
		cin.close();
	}

	private static void solve(int s) {
		for (int i = 6; i >= 0; i--) {
			int num = s / money[i];
			s %= money[i];
			for (int j = 0; j < num; j++) {
				System.out.println(money[i]);
			}
		}
	}
}