package AOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class P1228 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		BigInteger s = new BigInteger("1");
		for (int i = 1; i <= a; i++) {
			BigInteger x = new BigInteger(String.valueOf(i));
			s = s.multiply(x);
		}
		System.out.println(s);
		cin.close();
	}
}
