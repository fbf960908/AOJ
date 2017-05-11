package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1507 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int na = 0, nb = 0;
			while (a % 2 == 0) {
				a /= 2;
				na++;
			}
			while (b % 2 == 0) {
				b /= 2;
				nb++;
			}
			if (na == nb)
				System.out.println("=");
			else if (na > nb)
				System.out.println(">");
			else if (na < nb)
				System.out.println("<");
		}
		cin.close();
		cout.close();
	}
}
