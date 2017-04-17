package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1088 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
	static int[] money = { 1, 2, 5, 10, 20, 50, 100 };

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			if (N == 0)
				break;
			int num = 0;
			for (int i = 0; i < N; i++) {
				num += solve(cin.nextInt());
			}
			System.out.println(num);
		}
		cout.close();
		cin.close();
	}

	private static int solve(int s) {
		int num = 0;
		for (int i = 6; i >= 0; i--) {
			num += s / money[i];
			s %= money[i];
		}
		return num;
	}
}
