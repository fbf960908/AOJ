package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1325 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			System.out.println(change(N));
		}
		cin.close();
		cout.close();
	}

	private static StringBuffer change(int n) {
		if (n == 1)
			return new StringBuffer("A");
		StringBuffer ss = change(n - 1).append((char) (n + 64)).append(change(n - 1));
		return ss;
	}
}