package AOJ;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class P1298 {
	
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			int c = cin.nextInt();
			BigDecimal ba = new BigDecimal(Integer.toString(a));
			BigDecimal bb = new BigDecimal(Integer.toString(b));
			BigDecimal bc = ba.divide(bb, c, BigDecimal.ROUND_UP);
			cout.println(bc.toString());
		}
		cin.close();
		cout.close();
	}
}
