package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1443计树 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int sum = 0;
			if (a % 2 == 0) {
				System.out.println("0");
				continue;
			}
			if (a == 3) {
				System.out.println("1");
				continue;
			}
			a = a / 2 - 1;
			while (a > 0) {
				int n = 1;
				for (int i = 0; i < a; i++) {
					n = n * 2 % 10007;
				}
				sum += n;
				a -= 2;
			}
			System.out.println(sum);
		}
		cin.close();
		cout.close();
	}
}