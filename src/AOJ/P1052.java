package AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class P1052 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		int n = cin.nextInt();
		String x = cin.next();
		int count = 0;
		while (true) {
			if (demo(x).equals(x)) {
				System.out.println("STEP=" + count);
				break;
			} else {
				int a = Integer.valueOf(x, n);
				int b = Integer.valueOf(demo(x), n);
				x = Integer.toString(a + b, n);
			}
			count++;
			if (count == 30) {
				System.out.println("Impossible!");
				break;
			}
		}
		cin.close();
		cout.close();
	}

	private static String demo(String x) {
		return String.valueOf(new StringBuffer(x).reverse());
	}
}
