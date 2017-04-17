package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1249 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			if (a == 0 && b == 0)
				break;
			int c = a % 1000;
			int d = c;
			for (int i = 1; i < b; i++) {
				c = (c * d) % 1000;
			}
			System.out.println(c);
		}

		cin.close();
		cout.close();
	}
}
