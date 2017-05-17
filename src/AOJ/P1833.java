package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1833 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int ans = 1;
			for (int i = 1; i <= N; i++) {
				ans *= i;
				while (ans % 100 == 0) {
					ans /= 100;
				}
				ans %= 100;
			}
			if (ans % 10 == 0)
				ans /= 10;
			else
				ans %= 10;
			System.out.println(ans);
		}
		cin.close();
		cout.close();
	}
}
