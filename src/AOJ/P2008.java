package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P2008 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String args[]) {
		int T = cin.nextInt();
		int a = 0;
		while (T-- > 0) {
			a++;
			int n = cin.nextInt();
			double num = cin.nextDouble();
			double sum = 0;
			while (n-- > 0) {
				sum += cin.nextDouble() * cin.nextInt();
			}
			if (sum * 100 % 10 != 0) {
				sum = sum * 100 - sum * 100 % 10;
				sum /= 100;
				sum += 0.1;
			}
			double ans = num - sum;
			if (ans < 0) {
				System.out.println("Case #" + a + ": " + "-1");
				continue;
			}
			String str = String.format("%.2f", ans);
			System.out.println("Case #" + a + ": " + str);
		}
	}
}
