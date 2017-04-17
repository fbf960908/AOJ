package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1236 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			int a = cin.nextInt();
			int num = a;
			for (int i = 1; i < N; i++) {
				int b = cin.nextInt();
				num = min(num, b);
			}
			System.out.println(num);
		}
		cin.close();
		cout.close();
	}

	private static int min(int a, int b) {
		return a * b / max(a, b);
	}

	private static int max(int a, int b) {
		return b > 0 ? max(b, a % b) : a;
	}

}
