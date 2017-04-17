package AOJ;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class P1257 {
	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);

	public static void main(String[] args) {
		BigInteger a = cin.nextBigInteger();
		BigInteger b = cin.nextBigInteger();
		int c = cin.nextInt();
		String s = String.valueOf(c);
		BigInteger d = a.add(b);
		String str = String.valueOf(d);
		if (str.subSequence(str.length() - 1, str.length()).equals(s))
			System.out.println("YES");
		else
			System.out.println("NO");

		cin.close();
		cout.close();
	}
}
