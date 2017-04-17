package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1320 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		while (n-- > 0) {
			int x = cin.nextInt();
			System.out.println(F(x));
		}
		cin.close();
		cout.close();
	}

	private static int F(int x) {
		return x == 0 ? 1 : F(x - 1) + 2 * (x - 1);
	}
}
