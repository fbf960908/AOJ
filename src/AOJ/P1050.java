package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1050 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			int sum = (m + 1);
			if (n % m == 0) {
				for (int i = 0; i < n / m - 1; i++) {
					System.out.print(sum + " ");
					sum += 2 * m;
				}
				System.out.println(sum);
			} else {
				for (int i = 0; i < n / m; i++) {
					System.out.print(sum + " ");
					sum += 2 * m;
				}
				sum = 2 * (n - n % m + 1) * (n % m) + n % m * (n % m - 1);
				System.out.println(sum / (n % m));
			}
		}
		cin.close();
		cout.close();
	}
}
