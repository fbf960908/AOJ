package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1114 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();

			System.out.println(sum(a));
		}
		cin.close();
		cout.close();
	}

	private static int sum(int a) {
		if (a == 1)
			return 3;
		if (a == 2)
			return 4;
		if (a == 3)
			return 5;
		return sum(a - 1) + sum(a - 2) + sum(a - 3);
	}
}
