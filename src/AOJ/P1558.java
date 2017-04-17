package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1558 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int a = cin.nextInt();
		while (a-- > 0) {
			int x = cin.nextInt();
			int y = cin.nextInt();
			double mi = y * 1.0 / x;
			String str = String.format("%.2f", mi * 100);
			System.out.println(str + "%");
		}
		cin.close();
		cout.close();
	}
}
