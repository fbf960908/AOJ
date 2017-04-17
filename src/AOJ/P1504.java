package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1504 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			if (a + b >= c)
				System.out.println(a + b - c);
			else
				System.out.println("Impossible");
		}
		cin.close();
		cout.close();
	}
}
