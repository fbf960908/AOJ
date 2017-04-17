package AOJ;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class P1142 {

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			BigDecimal jc = jiechen(n).divide(jiechen(m).multiply(jiechen(n - m)));
			System.out.println(jc);
		}
		cin.close();
		cout.close();
	}

	private static BigDecimal jiechen(int n) {
		BigDecimal result = new BigDecimal(1);
		BigDecimal a;
		for (int i = 2; i <= n; i++) {
			a = new BigDecimal(i);
			result = result.multiply(a);
		}
		return result;
	}
}
