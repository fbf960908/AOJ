package AOJ;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class P1177大数阶乘 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {

		while (cin.hasNext()) {
			int n = cin.nextInt();
			BigDecimal result = new BigDecimal(1);
			BigDecimal a;
			for (int i = 2; i <= n; i++) {
				a = new BigDecimal(i);
				result = result.multiply(a);
			}
			System.out.println(result);
		}
		cin.close();
		cout.close();
	}
}
