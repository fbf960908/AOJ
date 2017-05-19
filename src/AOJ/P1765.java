package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1765 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int M = cin.nextInt();
			N = (N + 1) / M;
			System.out.println((int) Math.pow(2, N) - 1);
		}
		cin.close();
		cout.close();
	}
}
