package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1568 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int N = cin.nextInt();
			for (int i = 0; i < 1000; i++) {
				if (N <= feb(1, 1, i)) {
					System.out.println(i);
					break;
				}
			}
		}
		cin.close();
		cout.close();
	}

	public static long feb(long a, long b, int n) {
		if (n < 1)
			return 0;
		if (n == 1)
			return a;
		if (n == 2)
			return b;
		return feb(b, a + b, n - 1);
	}
}
