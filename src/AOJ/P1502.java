package AOJ;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class P1502 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int n = cin.nextInt();
			BigDecimal sum = BigDecimal.ZERO;
			for (int i = 1; i <= n; i++) {
				BigDecimal ss = new BigDecimal(quwei(a, i));
				sum = sum.add(ss);
			}
			System.out.println(sum);
		}
		cin.close();
		cout.close();
	}

	private static String quwei(int a, int i) {
		StringBuffer str = new StringBuffer();
		for (int j = 0; j < i; j++) {
			str.append(a);
		}
		return str.toString();
	}
}
