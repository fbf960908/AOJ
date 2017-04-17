package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1288 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		int a = 0;
		for (int i = 1; i <= N; i++) {
			int b = 1;
			for (int j = 1; j <= i; j++) {
				b = b * j % 1000000;
			}
			a += b;
		}
		a %= 1000000;
		System.out.println(a);

		cin.close();
		cout.close();
	}
}
