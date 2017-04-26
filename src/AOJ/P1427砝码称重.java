package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1427íÀÂë³ÆÖØ {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int N = cin.nextInt();
		while (N-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			int d = cin.nextInt();
			System.out.println(Math.abs(a * b - c * d));
		}
		cin.close();
		cout.close();
	}
}