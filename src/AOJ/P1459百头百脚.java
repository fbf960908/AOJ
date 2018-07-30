package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1459百头百脚 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			for (int i = 0; i <= n; i++) {
				int j = n - i;
				if (4 * i + 2 * j == m) {
					System.out.println(i + " " + j);
				}
			}
		}
		cin.close();
		cout.close();
	}
}